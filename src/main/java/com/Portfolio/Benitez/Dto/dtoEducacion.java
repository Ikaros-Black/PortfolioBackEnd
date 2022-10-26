/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.Benitez.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String DescripcionE;
    
    //contructores

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String DescripcionE) {
        this.nombreE = nombreE;
        this.DescripcionE = DescripcionE;
    }
    
    //Gettesrs and Setters

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

















