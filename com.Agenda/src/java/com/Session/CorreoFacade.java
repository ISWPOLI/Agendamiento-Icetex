/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Session;

import com.Entidades.Correo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Willy
 */
@Stateless
public class CorreoFacade extends AbstractFacade<Correo> {
    @PersistenceContext(unitName = "com.AgendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CorreoFacade() {
        super(Correo.class);
    }
    
}
