/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.BillMyCode.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author agust
 */
@Data
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Lob
    private String descripcion;
    private String contacto;
    private String razonSocial;
    private String email;
    private String direccion;
    private String telefono;
    private String password;
    private Imagen logo;
    @OneToMany
    private List<Developer> developer;
    private Double reputacion;
    @OneToMany
    private List<Comentario> comentario;
    private Boolean status;

}
