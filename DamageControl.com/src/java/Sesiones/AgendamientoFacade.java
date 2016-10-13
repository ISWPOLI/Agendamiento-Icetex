/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesiones;

import Entidades.Agendamiento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Willy
 */
@Stateless
public class AgendamientoFacade extends AbstractFacade<Agendamiento> {
    @PersistenceContext(unitName = "com.daagecontrolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgendamientoFacade() {
        super(Agendamiento.class);
    }
    
}
