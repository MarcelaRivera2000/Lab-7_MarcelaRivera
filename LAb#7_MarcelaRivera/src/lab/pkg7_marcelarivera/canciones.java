/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_marcelarivera;

import java.io.Serializable;

/**
 *
 * @author Mvrivera
 */
public class canciones  implements Serializable{
    private String nombre;
    private double segundos;

    public canciones() {
    }

    public canciones(String nombre, double segundos) {
        this.nombre = nombre;
        this.segundos = segundos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "canciones{" + "nombre=" + nombre + ", segundos=" + segundos + '}';
    }
    
    
    
    
}
