/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entidades;

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
 * declaracion de la entidad Agenda
 *
 *
 * @author Damage Control
 * @version 0.1.6
 */
@Entity
@Table(name = "AGENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a"),
    @NamedQuery(name = "Agenda.findByIdAgenda", query = "SELECT a FROM Agenda a WHERE a.idAgenda = :idAgenda"),
    @NamedQuery(name = "Agenda.findByTipo", query = "SELECT a FROM Agenda a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "Agenda.findByHora", query = "SELECT a FROM Agenda a WHERE a.hora = :hora"),
    @NamedQuery(name = "Agenda.findByFecha", query = "SELECT a FROM Agenda a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "Agenda.findByObservaciones", query = "SELECT a FROM Agenda a WHERE a.observaciones = :observaciones")})
public class Agenda implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Creacion de los atributos directo de la tabla
     */
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGENDA")
    private Integer idAgenda;
    @Size(max = 15)
    @Column(name = "TIPO")
    private String tipo;
    @Size(max = 9)
    @Column(name = "HORA")
    private String hora;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 110)
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    

    /**
     * @param idAgenda: contiene el id de la agenda.
     * @param tipo : contiene el tipo de la agenda.
     * @param hora: contiene la hora
     * @param fecha : contiene la fecha.
     * @param observaciones :contiene las observaciones.
     */
    
    
    /**
     * Creacion de los getters y setters y constructor 
     */
    public Agenda() {
    }

    public Agenda(Integer idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Integer getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Integer idAgenda) {
        this.idAgenda = idAgenda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgenda != null ? idAgenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO:Este metodo no funciona en el caso donde el metodo id no este ajustado 
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.idAgenda == null && other.idAgenda != null) || (this.idAgenda != null && !this.idAgenda.equals(other.idAgenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entidades.Agenda[ idAgenda=" + idAgenda + " ]";
    }

}