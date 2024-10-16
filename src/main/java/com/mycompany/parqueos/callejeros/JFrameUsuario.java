package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import javax.swing.*;
import java.awt.*;

//==================== Clase ==================== \\.

public class JFrameUsuario extends javax.swing.JFrame {

    // Constructor 
    public JFrameUsuario() {
        initComponents();
        
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        BotonImagen Boton = new BotonImagen();
        Boton.BotonImagen(botonPerfil, "/Imagenes/Perfil.png");
        Boton.BotonImagen(botonVehiculo, "/Imagenes/BotonVehiculo.png");
        Boton.BotonImagen(botonAgregarT, "/Imagenes/BotonATiempo.png");
        Boton.BotonImagen(botonAparcar, "/Imagenes/BotonAparcar.png");
        Boton.BotonImagen(botonDesaparcar, "/Imagenes/BotonDesaparcar.png");
        Boton.BotonImagen(botonCSesion, "/Imagenes/BotonCerrarSesion.png");
        Boton.BotonImagen(botonMPago, "/Imagenes/BotonMPago.png");
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelDegradado();
        botonAparcar = new javax.swing.JButton();
        botonPerfil = new javax.swing.JButton();
        botonVehiculo = new javax.swing.JButton();
        botonAgregarT = new javax.swing.JButton();
        botonDesaparcar = new javax.swing.JButton();
        botonCSesion = new javax.swing.JButton();
        botonMPago = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAparcar.setText("jButton1");
        botonAparcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAparcarActionPerformed(evt);
            }
        });

        botonPerfil.setText("jButton2");
        botonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilActionPerformed(evt);
            }
        });

        botonVehiculo.setText("jButton3");
        botonVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVehiculoActionPerformed(evt);
            }
        });

        botonAgregarT.setText("jButton4");
        botonAgregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTActionPerformed(evt);
            }
        });

        botonDesaparcar.setText("jButton5");
        botonDesaparcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesaparcarActionPerformed(evt);
            }
        });

        botonCSesion.setText("jButton6");
        botonCSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCSesionActionPerformed(evt);
            }
        });

        botonMPago.setText("jButton7");
        botonMPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(botonVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonAparcar, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(botonAgregarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonDesaparcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 290, Short.MAX_VALUE)
                .addComponent(botonCSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(botonVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAparcar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botonAgregarT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonDesaparcar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonMPago, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(botonCSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    
    private void botonAparcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAparcarActionPerformed
        System.out.println("Aparcando");
    }//GEN-LAST:event_botonAparcarActionPerformed

    private void botonAgregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarTActionPerformed
        System.out.println("Agregar tiempo");
    }//GEN-LAST:event_botonAgregarTActionPerformed

    private void botonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilActionPerformed
        System.out.println("Perfil");
    }//GEN-LAST:event_botonPerfilActionPerformed

    private void botonVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVehiculoActionPerformed
        System.out.println("Vehiculos");
    }//GEN-LAST:event_botonVehiculoActionPerformed

    private void botonDesaparcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesaparcarActionPerformed
        System.out.println("Desaparcando");
    }//GEN-LAST:event_botonDesaparcarActionPerformed

    private void botonMPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMPagoActionPerformed
        System.out.println("Tarjeta");
    }//GEN-LAST:event_botonMPagoActionPerformed

    private void botonCSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCSesionActionPerformed
        System.out.println("Cerrando sesion");
    }//GEN-LAST:event_botonCSesionActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUsuario().setVisible(true);
            }
        });
    }

//==================== Variables ==================== \\.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarT;
    private javax.swing.JButton botonAparcar;
    private javax.swing.JButton botonCSesion;
    private javax.swing.JButton botonDesaparcar;
    private javax.swing.JButton botonMPago;
    private javax.swing.JButton botonPerfil;
    private javax.swing.JButton botonVehiculo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
