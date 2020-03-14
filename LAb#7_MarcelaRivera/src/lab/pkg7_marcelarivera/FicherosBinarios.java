/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_marcelarivera;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class FicherosBinarios {
     private ArrayList<UsuariosGeneral> lista = new ArrayList();
    private File archivo = null;

    public FicherosBinarios() {
    }

    public FicherosBinarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<UsuariosGeneral> getListaPersonas() {
        return lista;
    }

    public void setListaPersonas(ArrayList<UsuariosGeneral> listaAlumnos) {
        this.lista = listaAlumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuario(UsuariosGeneral a) {
        lista.add(a);
    }

    public void cargarArchivo() {
        try {
            lista = new ArrayList();
            UsuariosGeneral temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (UsuariosGeneral) objeto.readObject()) != null) {
                        lista.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (UsuariosGeneral t : lista) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
