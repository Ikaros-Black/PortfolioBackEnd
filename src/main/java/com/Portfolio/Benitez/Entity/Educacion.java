/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.Benitez.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String DescripcionE;
    
    //contructores

    public Educacion() {
    }

    public Educacion(String nombreE, String DescripcionE) {
        this.nombreE = nombreE;
        this.DescripcionE = DescripcionE;
    }
   
    //GEtters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return DescripcionE;
    }

    public void setDescripcionE(String DescripcionE) {
        this.DescripcionE = DescripcionE;
    }
    
    
}
