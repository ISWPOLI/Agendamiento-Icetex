/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Session.ejb;

import com.Entidades.Seguridad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Willy
 */
@Stateless
public class SeguridadFacade extends AbstractFacade<Seguridad> {
    @PersistenceContext(unitName = "com.DcontrolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SeguridadFacade() {
        super(Seguridad.class);
    }
    
}
