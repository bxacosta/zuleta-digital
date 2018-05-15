/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuletadigital.service;

import com.zuletadigital.entity.Comunidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bryan
 */
@Stateless
public class ComunidadFacade extends AbstractFacade<Comunidad> implements ComunidadFacadeLocal {

    @PersistenceContext(unitName = "zuleta-digitalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComunidadFacade() {
        super(Comunidad.class);
    }
    
}
