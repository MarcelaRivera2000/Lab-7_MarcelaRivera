/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_marcelarivera;

import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mvrivera
 */
public class Simulacion  extends Thread {

    private JProgressBar barra;
    private JTable tabla;
    private boolean avanzar, vive;
    private int h;
    private ArrayList<canciones> canciones = new ArrayList();

    public Simulacion(JProgressBar barra, JTable tabla) {
        this.barra = barra;
        this.tabla = tabla;
        avanzar = true;
        vive = true;
    }

    public ArrayList<canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<canciones> canciones) {
        this.canciones = canciones;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public void run() {
        while (vive) {
            if (avanzar) {
                int cont = 0;
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 5) {
//                    DefaultTableModel t = (DefaultTableModel) tabla.getModel();
//                    Object[] usuarios = {canciones.get(cont).getNombre(), canciones.get(cont).getSegundos()};
//                    t.addRow(usuarios);

                    vive = false;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
}
