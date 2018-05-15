/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuletadigital.service;

import com.zuletadigital.entity.TipoArchivo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bryan
 */
@Local
public interface TipoArchivoFacadeLocal {

    void create(TipoArchivo tipoArchivo);

    void edit(TipoArchivo tipoArchivo);

    void remove(TipoArchivo tipoArchivo);

    TipoArchivo find(Object id);

    List<TipoArchivo> findAll();

    List<TipoArchivo> findRange(int[] range);

    int count();
    
}
