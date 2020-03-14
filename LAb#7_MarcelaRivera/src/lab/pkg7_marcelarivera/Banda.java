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
public class Banda extends Artistas  {

    private int n_integrantes;

    public Banda() {
    }

    public Banda(int n_integrantes, String generoMusical, String nombre, String contra, String usuario) {
        super(generoMusical, nombre, contra, usuario);
        this.n_integrantes = n_integrantes;
    }

   

    public int getN_integrantes() {
        return n_integrantes;
    }

    public void setN_integrantes(int n_integrantes) {
        this.n_integrantes = n_integrantes;
    }

    @Override
    public String toString() {
        return "Banda{" + "n_integrantes=" + n_integrantes + '}';
    }

}
