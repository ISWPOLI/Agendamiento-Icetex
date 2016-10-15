/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Willy
 */
@Entity
@Table(name = "SEGURIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seguridad.findAll", query = "SELECT s FROM Seguridad s"),
    @NamedQuery(name = "Seguridad.findByUsuario", query = "SELECT s FROM Seguridad s WHERE s.usuario = :usuario"),
    @NamedQuery(name = "Seguridad.findByPasword", query = "SELECT s FROM Seguridad s WHERE s.pasword = :pasword")})
public class Seguridad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "PASWORD")
    private String pasword;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seguridadUsuario")
    private List<Usuario> usuarioList;

    public Seguridad() {
    }

    public Seguridad(String usuario) {
        this.usuario = usuario;
    }

    public Seguridad(String usuario, String pasword) {
        this.usuario = usuario;
        this.pasword = pasword;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seguridad)) {
            return false;
        }
        Seguridad other = (Seguridad) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entidades.Seguridad[ usuario=" + usuario + " ]";
    }
    
}
