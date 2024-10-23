package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//==================== Clase ==================== \\.

public class JFrameVehiculos extends javax.swing.JFrame {
    
    private static Utilidades controlador = new Utilidades();
    
    private static Persona usuarioActivo = ParqueosCallejeros.usuarioActivo;
    
    private static Usuario usuario = (Usuario) usuarioActivo;
    
    private static Estacionamiento estacionamiento = ParqueosCallejeros.estacionamiento;
    
    private static int indice = 0;
    
    // Constructor:
    public JFrameVehiculos() {
        initComponents();
        
         // Icono:
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        controlador.cambiarImagenBoton(botonBack, "/Imagenes/back.png");
        controlador.cambiarImagenBoton(botonAtras, "/Imagenes/back.png");
        controlador.cambiarImagenBoton(botonSig, "/Imagenes/skip.png");
        jLabelPlaca.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelPlaca.setVerticalAlignment(SwingConstants.CENTER);
        jLabelMarca.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMarca.setVerticalAlignment(SwingConstants.CENTER);
        jLabelModelo.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelModelo.setVerticalAlignment(SwingConstants.CENTER);
        
        
        if(usuarioActivo != null){
            
            
            List<Vehiculo> listaVehiculos = usuario.getListaVehiculos();
            
            Vehiculo vehiculo = usuario.buscarVehiculo(indice);
            if (vehiculo != null){
                jLabelPlaca.setText(vehiculo.getPlaca());
                jLabelMarca.setText(vehiculo.getMarca());
                jLabelModelo.setText(vehiculo.getModelo());
            }
           
        }
      
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelDegradado();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        botonBack = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        botonSig = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonMultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Tus vehículos");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Placa");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelPlaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelPlaca.setText("No se registro placa");
        jLabelPlaca.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Marca");

        jLabelMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelMarca.setText("No se registro marca");
        jLabelMarca.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Modelo");

        jLabelModelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelModelo.setText("No se registro modelo");

        botonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBackActionPerformed(evt);
            }
        });

        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        botonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSigActionPerformed(evt);
            }
        });

        botonAgregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonAgregar.setText("Agregar Vehículo");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonEliminar.setText("Eliminar VehÍculo");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonMultas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonMultas.setText("Pagar Multas");
        botonMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(166, 166, 166))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addComponent(botonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(186, 186, 186))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelPlaca)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMarca))
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jLabelModelo)
                .addGap(87, 87, 87)
                .addComponent(botonAgregar)
                .addGap(36, 36, 36)
                .addComponent(botonEliminar)
                .addGap(34, 34, 34)
                .addComponent(botonMultas)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==================== Funcion de control ==================== \\.    
    
    private void botonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBackActionPerformed
        if(ParqueosCallejeros.usuarioActivo instanceof Administrador){
            JFrameAdmin jframeAdmin = new JFrameAdmin();
            jframeAdmin.setVisible(true);
            this.dispose();
        }
        
        if(ParqueosCallejeros.usuarioActivo instanceof Usuario){
            JFrameUsuario jFrameUsuario = new JFrameUsuario();
            jFrameUsuario.setVisible(true);
            this.dispose();
        }
        
        if(ParqueosCallejeros.usuarioActivo instanceof Inspector){
            JFrameInspector jFrameInspector = new JFrameInspector();
            jFrameInspector.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botonBackActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        indice--;
        Vehiculo vehiculoX = usuario.buscarVehiculo(indice);
        if (vehiculoX == null){
            indice++;
        }
        this.dispose();
        JFrameVehiculos jFrameVehiculos = new JFrameVehiculos();
        jFrameVehiculos.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSigActionPerformed
        indice++;
        Vehiculo vehiculoX = usuario.buscarVehiculo(indice);
        if (vehiculoX == null){
            indice--;
        }
        this.dispose();
        JFrameVehiculos jFrameVehiculos = new JFrameVehiculos();
        jFrameVehiculos.setVisible(true);
    }//GEN-LAST:event_botonSigActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        String nuevaPlaca = controlador.cambiarDato("Nueva Placa");
        if (nuevaPlaca == null){
            JOptionPane.showMessageDialog(this, "Ingrese placa", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        else if (nuevaPlaca.length() != 6){
            JOptionPane.showMessageDialog(this, "Placa debe ser de 6 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        else if (usuario.buscarVehiculoXP(nuevaPlaca)){
            JOptionPane.showMessageDialog(this, "La placa ya existe", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        else {
            String nuevaMarca = controlador.cambiarDato("Nueva Marca");
            if (nuevaMarca == null){
                JOptionPane.showMessageDialog(this, "Ingrese Marca", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            }
            else if (nuevaMarca.length() > 15 ){
                JOptionPane.showMessageDialog(this, "Marca debe ser de 0 a 15 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            }
            else {
                String nuevoModelo = controlador.cambiarDato("Nuevo Modelo");
                if (nuevoModelo == null){
                    JOptionPane.showMessageDialog(this, "Ingrese Modelo", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                }
                else if (nuevaMarca.length() > 15 ){
                    JOptionPane.showMessageDialog(this, "Modelo debe ser de 0 a 15 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    usuario.agregarVehiculo(nuevaPlaca, nuevaMarca, nuevoModelo, usuario);
                    this.dispose();
                    JFrameVehiculos jFrameVehiculos = new JFrameVehiculos();
                    jFrameVehiculos.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar?", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (opcion == JOptionPane.OK_OPTION) {
            Vehiculo vehiculo = usuario.buscarVehiculo(indice);
            usuario.eliminarVehiculo(vehiculo);
            indice = 0;
            this.dispose();
            JFrameVehiculos jFrameVehiculos = new JFrameVehiculos();
            jFrameVehiculos.setVisible(true);
        } 
        else if (opcion == JOptionPane.CANCEL_OPTION) {
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultasActionPerformed
        int monto = 0;
        if (usuario.getTarjeta() != null){
            Vehiculo vehiculoX = usuario.buscarVehiculo(indice);
            List<Multa> multas = vehiculoX.getMultasActivas();
            if (multas.isEmpty()){
                for (Multa multa: multas){
                    monto += multa.getCosto();
                }
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea pagar las multas? " + monto, "Confirmación", JOptionPane.OK_CANCEL_OPTION);

                if (opcion == JOptionPane.OK_OPTION) {
                    estacionamiento.agregarMulta(multas);
                    estacionamiento.agregarIngresoMulta(monto);
                    vehiculoX.setMultas();
                    vehiculoX.agregarHMultas(multas);
                } else if (opcion == JOptionPane.CANCEL_OPTION) {
                    return;
                }
            }   
            else{
                JOptionPane.showMessageDialog(this, "El vehiculo no tiene multas");
            } 
        } else{
            JOptionPane.showMessageDialog(this, "No tiene configurado el metodo de pago");
            }
    }//GEN-LAST:event_botonMultasActionPerformed

//==================== Main ==================== \\.
    
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
            java.util.logging.Logger.getLogger(JFrameVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVehiculos().setVisible(true);
            }
        });
    }

//==================== Variables ==================== \\.
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBack;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonMultas;
    private javax.swing.JButton botonSig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
