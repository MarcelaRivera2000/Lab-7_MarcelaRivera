/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_marcelarivera;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        b.cargarArchivo();
        for (UsuariosGeneral u : b.getListaPersonas()) {
            usuarios.add(u);
            System.out.println(u.getUsuario() + " " + u.getContra());
        }
        Hilo_1 h1 = new Hilo_1(jProgressBar1);
        h1=new Hilo_1(jProgressBar1);
        h1=new Hilo_1(jProgressBar2);
        h1=new Hilo_1(jProgressBar3);
        h1=new Hilo_1(jProgressBar4);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        u_nombre = new javax.swing.JTextField();
        u_usuario = new javax.swing.JTextField();
        u_pass = new javax.swing.JTextField();
        u_edad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        b_nombre = new javax.swing.JTextField();
        b_usuario = new javax.swing.JTextField();
        b_pass = new javax.swing.JTextField();
        b_cantidad = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b_genero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        s_nombre = new javax.swing.JTextField();
        s_usuario = new javax.swing.JTextField();
        s_pass = new javax.swing.JTextField();
        s_edad = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        s_genero = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        PrincipalSolistas = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        cancion_nombre = new javax.swing.JTextField();
        cancion_duracion = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        evento_feha = new datechooser.beans.DateChooserCombo();
        eventos_cant = new javax.swing.JSpinner();
        evento_lugar = new javax.swing.JTextField();
        evento_ciudad = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCanciones = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jButton11 = new javax.swing.JButton();
        PrincipalBanda = new javax.swing.JFrame();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        cancion_nombre1 = new javax.swing.JTextField();
        cancion_duracion1 = new javax.swing.JSpinner();
        jButton8 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        evento_feha1 = new datechooser.beans.DateChooserCombo();
        eventos_cant1 = new javax.swing.JSpinner();
        evento_lugar1 = new javax.swing.JTextField();
        evento_ciudad1 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCanciones1 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        jButton10 = new javax.swing.JButton();
        PrincipalUSuario = new javax.swing.JFrame();
        jButton12 = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaArtistas = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaCancionesGeneral = new javax.swing.JList<>();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaArtistasfavS = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaEventos = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        Evento = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        jp_simu = new javax.swing.JProgressBar();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jt_simu = new javax.swing.JTable();
        Login_usu = new javax.swing.JTextField();
        Login_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton3.setText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Usuario:");

        jLabel5.setText("Pass:");

        jLabel6.setText("Edad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(u_nombre)
                    .addComponent(u_usuario)
                    .addComponent(u_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(u_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(u_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(u_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(u_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuario", jPanel1);

        jLabel7.setText("Genero Musical:");

        jButton4.setText("Registrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre:");

        jLabel9.setText("Usuario:");

        jLabel10.setText("Pass:");

        jLabel11.setText("Cantidad Integrantes:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_nombre)
                            .addComponent(b_usuario)
                            .addComponent(b_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_genero, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(b_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(b_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Banda", jPanel2);

        jLabel12.setText("Edad:");

        jButton5.setText("Registrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel13.setText("Nombre:");

        jLabel14.setText("Usuario:");

        jLabel15.setText("Pass:");

        jLabel16.setText("Genero Musical:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s_nombre)
                        .addComponent(s_usuario)
                        .addComponent(s_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(s_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addComponent(s_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(32, 32, 32)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Solista", jPanel3);

        jButton15.setText("Volver");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jProgressBar1.setMaximum(5);

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        jButton6.setText("Agregar cancion");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel17.setText("Nombre de la cancion:");

        jLabel18.setText("Duracion (s):");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("CREAR CANCION");

        jButton7.setText("Agregar Evento");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel20.setText("Lugar:");

        jLabel21.setText("Ciudad:");

        jLabel22.setText("Capacidad de personas:");

        jLabel23.setText("Fecha:");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setText("CREAR EVENTO");

        TablaCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Duracion", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaCanciones);

        jLabel25.setText("Seleccione las canciones deseadas");

        jProgressBar2.setMaximum(8);

        jProgressBar4.setMaximum(3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel17))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel19)
                                        .addComponent(eventos_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancion_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancion_nombre)
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                        .addComponent(evento_lugar)
                                        .addComponent(evento_ciudad)
                                        .addComponent(evento_feha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cancion_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cancion_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(evento_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel20))
                                                .addGap(18, 18, 18)
                                                .addComponent(evento_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel21))
                                        .addGap(18, 18, 18)
                                        .addComponent(eventos_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addComponent(evento_feha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23))
                        .addGap(26, 26, 26)
                        .addComponent(jButton7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Agregar Cancion", jPanel5);

        jButton11.setText("Log Out");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalSolistasLayout = new javax.swing.GroupLayout(PrincipalSolistas.getContentPane());
        PrincipalSolistas.getContentPane().setLayout(PrincipalSolistasLayout);
        PrincipalSolistasLayout.setHorizontalGroup(
            PrincipalSolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalSolistasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PrincipalSolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton11)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PrincipalSolistasLayout.setVerticalGroup(
            PrincipalSolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalSolistasLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jButton8.setText("Agregar cancion");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel26.setText("Nombre de la cancion:");

        jLabel27.setText("Duracion (s):");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel28.setText("CREAR CANCION");

        jButton9.setText("Agregar Evento");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel29.setText("Lugar:");

        jLabel30.setText("Ciudad:");

        jLabel31.setText("Capacidad de personas:");

        jLabel32.setText("Fecha:");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel33.setText("CREAR EVENTO");

        TablaCanciones1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Duracion", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaCanciones1);

        jLabel34.setText("Seleccione las canciones deseadas");

        jProgressBar3.setMaximum(8);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel28)
                        .addComponent(eventos_cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancion_duracion1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancion_nombre1)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                        .addComponent(evento_lugar1)
                        .addComponent(evento_ciudad1)
                        .addComponent(evento_feha1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(cancion_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(cancion_duracion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(evento_lugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel29))
                                                .addGap(18, 18, 18)
                                                .addComponent(evento_ciudad1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel30))
                                        .addGap(18, 18, 18)
                                        .addComponent(eventos_cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel31))
                                .addGap(18, 18, 18)
                                .addComponent(evento_feha1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel32))
                        .addGap(26, 26, 26)
                        .addComponent(jButton9)))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Agregar Cancion", jPanel6);

        jButton10.setText("Log Out");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalBandaLayout = new javax.swing.GroupLayout(PrincipalBanda.getContentPane());
        PrincipalBanda.getContentPane().setLayout(PrincipalBandaLayout);
        PrincipalBandaLayout.setHorizontalGroup(
            PrincipalBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalBandaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PrincipalBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PrincipalBandaLayout.setVerticalGroup(
            PrincipalBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalBandaLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jButton12.setText("Log out");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel35.setText("ARTISTAS");

        TablaArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Usuario", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaArtistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaArtistasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaArtistas);

        jButton13.setText("Agregar a la lista de favoritos");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel36.setText("CANCIONES");

        ListaCancionesGeneral.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(ListaCancionesGeneral);

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel37.setText("ARTISTAS FAVORITOS");

        TablaArtistasfavS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Usuario", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TablaArtistasfavS);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton13))))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Seguir Artistas", jPanel4);

        TablaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lugar", "Ciudad", "Capacidad de personas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(TablaEventos);

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel38.setText("EVENTOS");

        jButton14.setText("Asistir a evento");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addComponent(jLabel38))
                .addContainerGap(509, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Eventos", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 992, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("tab3", jPanel8);

        javax.swing.GroupLayout PrincipalUSuarioLayout = new javax.swing.GroupLayout(PrincipalUSuario.getContentPane());
        PrincipalUSuario.getContentPane().setLayout(PrincipalUSuarioLayout);
        PrincipalUSuarioLayout.setHorizontalGroup(
            PrincipalUSuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalUSuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalUSuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrincipalUSuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane4))
                .addGap(21, 21, 21))
        );
        PrincipalUSuarioLayout.setVerticalGroup(
            PrincipalUSuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalUSuarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel40.setText("Titulo:");

        jt_simu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cancion", "Duracion", "Artista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jt_simu);

        javax.swing.GroupLayout EventoLayout = new javax.swing.GroupLayout(Evento.getContentPane());
        Evento.getContentPane().setLayout(EventoLayout);
        EventoLayout.setHorizontalGroup(
            EventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventoLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addGap(26, 26, 26)
                .addGroup(EventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_simu, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        EventoLayout.setVerticalGroup(
            EventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(EventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EventoLayout.createSequentialGroup()
                        .addGroup(EventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addGap(18, 18, 18)
                        .addComponent(jp_simu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Pass:");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Login_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(Login_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2))))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton2)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Login_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Login_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        usuarios.add(new Solistas(Integer.parseInt(s_edad.getValue().toString()), s_genero.getText(), s_nombre.getText(), s_pass.getText(), s_usuario.getText()));
        b.cargarArchivo();
        b.setUsuario(usuarios.get(usuarios.size() - 1));
        b.escribirArchivo();
        Hilo_1 h1 = new Hilo_1(jProgressBar1);
        h1.setH(5);
h1.start();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        usuarios.add(new Banda(Integer.parseInt(b_cantidad.getValue().toString()), b_genero.getText(), b_nombre.getText(), b_pass.getText(), b_usuario.getText()));
        b.cargarArchivo();
        b.setUsuario(usuarios.get(usuarios.size() - 1));
        b.escribirArchivo();
        Hilo_1 h1 = new Hilo_1(jProgressBar1);
        h1.setH(5);
h1.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        usuarios.add(new Usuario(Integer.parseInt(u_edad.getValue().toString()), u_nombre.getText(), u_pass.getText(), u_usuario.getText()));
        b.cargarArchivo();
        b.setUsuario(usuarios.get(usuarios.size() - 1));
        b.escribirArchivo();
        Hilo_1 h1 = new Hilo_1(jProgressBar1);
        h1.setH(5);
        h1.start();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registro.pack();
        Registro.setLocationRelativeTo(this);
        Registro.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean aux = true;
        int cont = 0;
        for (UsuariosGeneral i : usuarios) {
            if (i.getUsuario().equals(Login_usu.getText()) && i.getContra().equals(Login_pass.getText())) {
                aux = false;
                posi = cont;
                if (i instanceof Banda) {
                    PrincipalBanda.pack();
                    PrincipalBanda.setLocationRelativeTo(this);
                    PrincipalBanda.setVisible(true);
                }
                if (i instanceof Usuario) {
                    PrincipalUSuario.pack();
                    PrincipalUSuario.setLocationRelativeTo(this);
                    PrincipalUSuario.setVisible(true);
                    llenarArtistas();
                    llenarArtistasFAVS();
                            eventos();

                }
                if (i instanceof Solistas) {
                    PrincipalSolistas.pack();
                    PrincipalSolistas.setLocationRelativeTo(this);
                    PrincipalSolistas.setVisible(true);
                    llenartablacanciones();
                }

            }
            cont++;
        }
        if (aux == true) {
            JOptionPane.showMessageDialog(this, "No encontro el usuario");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ((Artistas) usuarios.get(posi)).getCanciones().add(new canciones(cancion_nombre.getText(), Double.parseDouble(cancion_duracion.getValue().toString())));
        b.cargarArchivo();
        ((Artistas) b.getListaPersonas().get(posi)).getCanciones().add(new canciones(cancion_nombre.getText(), Double.parseDouble(cancion_duracion.getValue().toString())));
        b.escribirArchivo();
        llenartablacanciones();
         Hilo_1 h1 = new Hilo_1(jProgressBar4);
        h1.setH(3);
        h1.start();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Eventos e = new Eventos(evento_feha.getText(), evento_ciudad.getText(), evento_lugar.getText(), Integer.parseInt(eventos_cant.getValue().toString()));
        DefaultTableModel t = (DefaultTableModel) TablaCanciones.getModel();
        int[] rt = TablaCanciones.getSelectedRows();
        for (int i = 0; i < t.getRowCount(); i++) {
            if (t.getValueAt(i, 2).equals(true)) {
                e.getCanciones().add(((Artistas) usuarios.get(posi)).getCanciones().get(i));
            }
        }
        ((Artistas) usuarios.get(posi)).getEventos().add(e);
        b.cargarArchivo();
        ((Artistas) b.getListaPersonas().get(posi)).getEventos().add(e);
        b.escribirArchivo();
        Hilo_1 h1 = new Hilo_1(jProgressBar2);
        h1.setH(8);
        h1.start();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ((Artistas) usuarios.get(posi)).getCanciones().add(new canciones(cancion_nombre1.getText(), Double.parseDouble(cancion_duracion1.getValue().toString())));
        b.cargarArchivo();
        ((Artistas) b.getListaPersonas().get(posi)).getCanciones().add(new canciones(cancion_nombre1.getText(), Double.parseDouble(cancion_duracion1.getValue().toString())));
        b.escribirArchivo();
        llenartablacanciones();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Eventos e = new Eventos(evento_feha1.getText(), evento_ciudad1.getText(), evento_lugar1.getText(), Integer.parseInt(eventos_cant1.getValue().toString()));
        DefaultTableModel t = (DefaultTableModel) TablaCanciones1.getModel();
        int[] rt = TablaCanciones1.getSelectedRows();
        for (int i = 0; i < t.getRowCount(); i++) {
            if (t.getValueAt(i, 2).equals(true)) {
                e.getCanciones().add(((Artistas) usuarios.get(posi)).getCanciones().get(i));
            }
        }
        ((Artistas) usuarios.get(posi)).getEventos().add(e);
        b.cargarArchivo();
        ((Artistas) b.getListaPersonas().get(posi)).getEventos().add(e);
        b.escribirArchivo();
         Hilo_1 h1 = new Hilo_1(jProgressBar3);
        h1.setH(8);
        h1.start();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        PrincipalBanda.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        PrincipalSolistas.setVisible(false);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        PrincipalUSuario.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void TablaArtistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaArtistasMouseClicked
        int i = TablaArtistas.getSelectedRow();
        if (i >= 0) {
            DefaultListModel modelo = (DefaultListModel) ListaCancionesGeneral.getModel();
            modelo.removeAllElements();
            for (canciones n : ((Artistas) usuarios.get(i)).getCanciones()) {
                modelo.addElement(n.getNombre());
            }
            ListaCancionesGeneral.setModel(modelo);
        }
    }//GEN-LAST:event_TablaArtistasMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int i = TablaArtistas.getSelectedRow();
        if (i >= 0) {
            ((Usuario) usuarios.get(posi)).getArtistas().add(((Artistas) usuarios.get(i)));
            b.cargarArchivo();
            ((Usuario) b.getListaPersonas().get(posi)).getArtistas().add(((Artistas) usuarios.get(i)));
            b.escribirArchivo();
            llenarArtistasFAVS();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int i = TablaEventos.getSelectedRow();
        if (i >= 0) {
            Evento.pack();
            Evento.setLocationRelativeTo(null);
            Evento.setVisible(true);

            jp_simu.setMaximum(5);
            s.setH(5);
            s.setCanciones(((Artistas) usuarios.get(i)).getCanciones());
            s.start();

        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked
        eventos();
    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    Registro.setVisible(false);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    public void eventos() {
        DefaultTableModel t = (DefaultTableModel) TablaEventos.getModel();
        for (int i = t.getRowCount() - 1; i >= 0; i--) {
            t.removeRow(i);
        }
        for (UsuariosGeneral i : usuarios) {
            if (i instanceof Artistas) {
                for (Eventos y : ((Artistas) i).getEventos()) {
                    Object[] usuarios = {y.getLugar(), y.getCuidad(), y.getCapacidad()};
                    t.addRow(usuarios);
                }

            }
        }

        TablaEventos.setModel(t);
    }

    public void llenarArtistas() {
        DefaultTableModel t = (DefaultTableModel) TablaArtistas.getModel();
        for (int i = t.getRowCount() - 1; i >= 0; i--) {
            t.removeRow(i);
        }
        for (UsuariosGeneral i : usuarios) {
            if (i instanceof Artistas) {
                Object[] usuarios = {i.getNombre(), i.getUsuario(), ((Artistas) i).getGeneroMusical()};
                t.addRow(usuarios);
            }

        }
        TablaArtistas.setModel(t);
    }

    public void llenarArtistasFAVS() {
        DefaultTableModel t = (DefaultTableModel) TablaArtistasfavS.getModel();
        for (int i = t.getRowCount() - 1; i >= 0; i--) {
            t.removeRow(i);
        }
        for (UsuariosGeneral i : ((Usuario) usuarios.get(posi)).getArtistas()) {
            if (i instanceof Artistas) {
                Object[] usuarios = {i.getNombre(), i.getUsuario(), ((Artistas) i).getGeneroMusical()};
                t.addRow(usuarios);
            }

        }
        TablaArtistasfavS.setModel(t);
    }

    public void llenartablacanciones() {
        DefaultTableModel t = (DefaultTableModel) TablaCanciones.getModel();
        for (int i = t.getRowCount() - 1; i >= 0; i--) {
            t.removeRow(i);
        }
        for (canciones i : ((Artistas) usuarios.get(posi)).getCanciones()) {
            Object[] usuarios = {i.getNombre(), i.getSegundos(), false};
            t.addRow(usuarios);
        }
        TablaCanciones.setModel(t);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Evento;
    private javax.swing.JList<String> ListaCancionesGeneral;
    private javax.swing.JPasswordField Login_pass;
    private javax.swing.JTextField Login_usu;
    private javax.swing.JFrame PrincipalBanda;
    private javax.swing.JFrame PrincipalSolistas;
    private javax.swing.JFrame PrincipalUSuario;
    private javax.swing.JFrame Registro;
    private javax.swing.JTable TablaArtistas;
    private javax.swing.JTable TablaArtistasfavS;
    private javax.swing.JTable TablaCanciones;
    private javax.swing.JTable TablaCanciones1;
    private javax.swing.JTable TablaEventos;
    private javax.swing.JSpinner b_cantidad;
    private javax.swing.JTextField b_genero;
    private javax.swing.JTextField b_nombre;
    private javax.swing.JTextField b_pass;
    private javax.swing.JTextField b_usuario;
    private javax.swing.JSpinner cancion_duracion;
    private javax.swing.JSpinner cancion_duracion1;
    private javax.swing.JTextField cancion_nombre;
    private javax.swing.JTextField cancion_nombre1;
    private javax.swing.JTextField evento_ciudad;
    private javax.swing.JTextField evento_ciudad1;
    private datechooser.beans.DateChooserCombo evento_feha;
    private datechooser.beans.DateChooserCombo evento_feha1;
    private javax.swing.JTextField evento_lugar;
    private javax.swing.JTextField evento_lugar1;
    private javax.swing.JSpinner eventos_cant;
    private javax.swing.JSpinner eventos_cant1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JProgressBar jp_simu;
    private javax.swing.JTable jt_simu;
    private javax.swing.JSpinner s_edad;
    private javax.swing.JTextField s_genero;
    private javax.swing.JTextField s_nombre;
    private javax.swing.JTextField s_pass;
    private javax.swing.JTextField s_usuario;
    private javax.swing.JSpinner u_edad;
    private javax.swing.JTextField u_nombre;
    private javax.swing.JTextField u_pass;
    private javax.swing.JTextField u_usuario;
    // End of variables declaration//GEN-END:variables
    ArrayList<UsuariosGeneral> usuarios = new ArrayList();
    FicherosBinarios b = new FicherosBinarios("./Usuarios.bin");

    int posi;
    Simulacion s = new Simulacion(jp_simu, jt_simu);

}
