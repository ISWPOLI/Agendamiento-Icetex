/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

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
    @NamedQuery(name = "Seguridad.findByContrase\u00f1a", query = "SELECT s FROM Seguridad s WHERE s.contrase\u00f1a = :contrase\u00f1a")})
public class Seguridad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CONTRASE\u00d1A")
    private String contraseña;

    public Seguridad() {
    }

    public Seguridad(String usuario) {
        this.usuario = usuario;
    }

    public Seguridad(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
        return "Entidades.Seguridad[ usuario=" + usuario + " ]";
    }
    
}
