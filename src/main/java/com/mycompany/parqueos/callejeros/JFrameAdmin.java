package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

//==================== Clase ==================== \\.

public class JFrameAdmin extends javax.swing.JFrame {

    // Contructor: 
    
    
    public JFrameAdmin() {
        initComponents();
        
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        Utilidades controlador = new Utilidades();
        BotonImagen Boton = new BotonImagen();
        Boton.BotonImagen(botonPerfil, "/Imagenes/Perfil.png");
        Boton.BotonImagen(botonConfi, "/Imagenes/BotonConfi.png");
        Boton.BotonImagen(botonReportes, "/Imagenes/BotonReportes.png");
        Boton.BotonImagen(botonAgregarInspector, "/Imagenes/BotonAInspector.png");
        Boton.BotonImagen(botonCSesion, "/Imagenes/BotonCerrarSesion.png");

        

        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    

//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        JPanelFondo = new PanelDegradado();
        botonConfi = new javax.swing.JButton();
        botonReportes = new javax.swing.JButton();
        botonAgregarInspector = new javax.swing.JButton();
        botonCSesion = new javax.swing.JButton();
        botonPerfil = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JFrameAdmin");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        JPanelFondo.setBackground(new java.awt.Color(255, 255, 255));

        botonConfi.setText("Configuración");
        botonConfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfiActionPerformed(evt);
            }
        });

        botonReportes.setText("Reportes");
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });

        botonAgregarInspector.setText("Agregar Inspector");
        botonAgregarInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarInspectorActionPerformed(evt);
            }
        });

        botonCSesion.setText("Cerrar Sesión");
        botonCSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCSesionActionPerformed(evt);
            }
        });

        botonPerfil.setText("jButton3");
        botonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelFondoLayout = new javax.swing.GroupLayout(JPanelFondo);
        JPanelFondo.setLayout(JPanelFondoLayout);
        JPanelFondoLayout.setHorizontalGroup(
            JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelFondoLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonConfi, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(botonReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(botonAgregarInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelFondoLayout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        JPanelFondoLayout.setVerticalGroup(
            JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelFondoLayout.createSequentialGroup()
                .addComponent(botonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonConfi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(botonAgregarInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(botonCSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//==================== Funcion de control ==================== \\.
    
    private void botonConfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfiActionPerformed
        
        JFrameConfiguracion jFrameConfiguracion = new JFrameConfiguracion();
        jFrameConfiguracion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonConfiActionPerformed

    private void botonAgregarInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarInspectorActionPerformed
        
        JFrameAddInspector jframeAddInspector = new JFrameAddInspector();
        jframeAddInspector.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAgregarInspectorActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        System.out.println("Reportes");
    }//GEN-LAST:event_botonReportesActionPerformed

    private void botonCSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCSesionActionPerformed
        System.out.println("Cerrando sesion");
        ParqueosCallejeros.usuarioActivo = null;
        JFrameInicioSesion jframeInicioSesion = new JFrameInicioSesion();
        jframeInicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCSesionActionPerformed

    private void botonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilActionPerformed
        System.out.println("Perfil");
        JFramePerfil jFramePerfil = new JFramePerfil();
        jFramePerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonPerfilActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdmin().setVisible(true);
            }
        });
    }

    
//==================== Variables ==================== \\.
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelFondo;
    private javax.swing.JButton botonAgregarInspector;
    private javax.swing.JButton botonCSesion;
    private javax.swing.JButton botonConfi;
    private javax.swing.JButton botonPerfil;
    private javax.swing.JButton botonReportes;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
