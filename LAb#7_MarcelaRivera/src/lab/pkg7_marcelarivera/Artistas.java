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
public class Artistas extends UsuariosGeneral{
  private String generoMusical;
  private ArrayList<canciones> canciones=new ArrayList();
  private ArrayList<Eventos> eventos=new ArrayList();
  
    public Artistas() {
    }

    public Artistas(String generoMusical, String nombre, String contra, String usuario) {
        super(nombre, contra, usuario);
        this.generoMusical = generoMusical;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public ArrayList<canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<canciones> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Eventos> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        return "Artistas{" + "generoMusical=" + generoMusical + ", canciones=" + canciones + ", eventos=" + eventos + '}';
    }

   

}
