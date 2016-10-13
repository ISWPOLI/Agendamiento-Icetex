/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Willy
 */
@Entity
@Table(name = "AGENDAMIENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agendamiento.findAll", query = "SELECT a FROM Agendamiento a"),
    @NamedQuery(name = "Agendamiento.findByIdAgendamiento", query = "SELECT a FROM Agendamiento a WHERE a.idAgendamiento = :idAgendamiento"),
    @NamedQuery(name = "Agendamiento.findByFecha", query = "SELECT a FROM Agendamiento a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "Agendamiento.findByTsolicit", query = "SELECT a FROM Agendamiento a WHERE a.tsolicit = :tsolicit"),
    @NamedQuery(name = "Agendamiento.findByHora", query = "SELECT a FROM Agendamiento a WHERE a.hora = :hora")})
public class Agendamiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGENDAMIENTO")
    private Long idAgendamiento;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 20)
    @Column(name = "TSOLICIT")
    private String tsolicit;
    @Size(max = 20)
    @Column(name = "HORA")
    private String hora;

    public Agendamiento() {
    }

    public Agendamiento(Long idAgendamiento) {
        this.idAgendamiento = idAgendamiento;
    }

    public Long getIdAgendamiento() {
        return idAgendamiento;
    }

    public void setIdAgendamiento(Long idAgendamiento) {
        this.idAgendamiento = idAgendamiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTsolicit() {
        return tsolicit;
    }

    public void setTsolicit(String tsolicit) {
        this.tsolicit = tsolicit;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgendamiento != null ? idAgendamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agendamiento)) {
            return false;
        }
        Agendamiento other = (Agendamiento) object;
        if ((this.idAgendamiento == null && other.idAgendamiento != null) || (this.idAgendamiento != null && !this.idAgendamiento.equals(other.idAgendamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Agendamiento[ idAgendamiento=" + idAgendamiento + " ]";
    }
    
}
