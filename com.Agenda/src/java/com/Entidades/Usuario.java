/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuario.findByApellido", query = "SELECT u FROM Usuario u WHERE u.apellido = :apellido"),
    @NamedQuery(name = "Usuario.findByTelefono", query = "SELECT u FROM Usuario u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Usuario.findByTipoDocumento", query = "SELECT u FROM Usuario u WHERE u.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Usuario.findByIdAgendamiento", query = "SELECT u FROM Usuario u WHERE u.idAgendamiento = :idAgendamiento")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private Long idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "APELLIDO")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "TELEFONO")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Column(name = "ID_AGENDAMIENTO")
    private Long idAgendamiento;
    @JoinColumn(name = "CORREO_ID_CORREO", referencedColumnName = "ID_CORREO")
    @ManyToOne(optional = false)
    private Correo correoIdCorreo;
    @JoinColumn(name = "SEGURIDAD_USUARIO", referencedColumnName = "USUARIO")
    @ManyToOne(optional = false)
    private Seguridad seguridadUsuario;

    public Usuario() {
    }

    public Usuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Long idUsuario, String nombre, String apellido, String telefono, String tipoDocumento) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoDocumento = tipoDocumento;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getIdAgendamiento() {
        return idAgendamiento;
    }

    public void setIdAgendamiento(Long idAgendamiento) {
        this.idAgendamiento = idAgendamiento;
    }

    public Correo getCorreoIdCorreo() {
        return correoIdCorreo;
    }

    public void setCorreoIdCorreo(Correo correoIdCorreo) {
        this.correoIdCorreo = correoIdCorreo;
    }

    public Seguridad getSeguridadUsuario() {
        return seguridadUsuario;
    }

    public void setSeguridadUsuario(Seguridad seguridadUsuario) {
        this.seguridadUsuario = seguridadUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entidades.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
