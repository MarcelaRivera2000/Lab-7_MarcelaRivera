/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_marcelarivera;

import javax.swing.JProgressBar;

/**
 *
 * @author Mvrivera
 */
public class Hilo_1 extends Thread{
    private JProgressBar barra;
    private boolean avanzar,vive;
    
     public Hilo_1(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
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
    
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==5){
                    vive=false;
                }
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                }
            }
        }
    }
    
    
}
