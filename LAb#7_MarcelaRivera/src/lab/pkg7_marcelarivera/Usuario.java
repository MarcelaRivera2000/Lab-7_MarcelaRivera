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
public class Usuario extends UsuariosGeneral{
    private int edad;
    private ArrayList<Eventos> eventos=new ArrayList();
    private ArrayList<Artistas> artistas=new ArrayList();

    public Usuario() {
    }

    public Usuario(int edad, String nombre, String contra, String usuario) {
        super(nombre, contra, usuario);
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Eventos> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Artistas> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artistas> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "edad=" + edad + ", eventos=" + eventos + ", artistas=" + artistas + '}';
    }
    
    
    
}
