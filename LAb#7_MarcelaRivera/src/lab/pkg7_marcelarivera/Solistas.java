/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_marcelarivera;

import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Solistas extends Artistas{
    
    private int edad;
  

    public Solistas() {
    }

    public Solistas(int edad, String generoMusical, String nombre, String contra, String usuario) {
        super(generoMusical, nombre, contra, usuario);
        this.edad = edad;
    }

  

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Solistas{" + "edad=" + edad + '}';
    }




    
}
