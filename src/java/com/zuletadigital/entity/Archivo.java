/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuletadigital.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "archivo")
public class Archivo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_archivo")
    private Integer id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "fechaCreacion")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TipoArchivo tipoArchivo;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
