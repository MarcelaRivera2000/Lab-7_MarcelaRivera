/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_marcelarivera;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Eventos  implements Serializable{
    private String fecha,cuidad,lugar;
    private int capacidad;
    private ArrayList<canciones> canciones=new ArrayList();

    public Eventos() {
    }

    public Eventos(String fecha, String cuidad, String lugar, int capacidad) {
        this.fecha = fecha;
        this.cuidad = cuidad;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Eventos{" + "fecha=" + fecha + ", cuidad=" + cuidad + ", lugar=" + lugar + ", capacidad=" + capacidad + ", canciones=" + canciones + '}';
    }
    
    
}
