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
public class UsuariosGeneral implements Serializable{
    private String nombre,contra,usuario;

    public UsuariosGeneral() {
    }

    public UsuariosGeneral(String nombre, String contra, String usuario) {
        this.nombre = nombre;
        this.contra = contra;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "UsuariosGeneral{" + "nombre=" + nombre + ", contra=" + contra + ", usuario=" + usuario + '}';
    }
    
    
    
}
