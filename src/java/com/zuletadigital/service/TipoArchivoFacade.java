/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuletadigital.service;

import com.zuletadigital.entity.TipoArchivo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bryan
 */
@Stateless
public class TipoArchivoFacade extends AbstractFacade<TipoArchivo> implements TipoArchivoFacadeLocal {

    @PersistenceContext(unitName = "zuleta-digitalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoArchivoFacade() {
        super(TipoArchivo.class);
    }
    
}
