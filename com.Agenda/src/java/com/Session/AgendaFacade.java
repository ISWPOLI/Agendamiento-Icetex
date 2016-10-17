/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Session;

import com.Entidades.Agenda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Willy
 */
@Stateless
public class AgendaFacade extends AbstractFacade<Agenda> {
    @PersistenceContext(unitName = "com.AgendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgendaFacade() {
        super(Agenda.class);
    }
    
}
