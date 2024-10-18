package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import javax.swing.*;
import java.awt.*;

//==================== Clase ==================== \\.

public class JFrameConfiguracion extends javax.swing.JFrame {

    // Constructor:
    public JFrameConfiguracion() {
        initComponents();
        
        // Icono:
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        AjustarControles controlador = new AjustarControles();
        controlador.centrarBoton(botonCConfi);
        controlador.centrarLabel(jPanel1, labelTitulo);
        controlador.cambiarImagenBoton(botonBack, "/Imagenes/back.png");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }


//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelDegradado();
        textFieldHInicio = new javax.swing.JTextField();
        textFieldHFin = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        labelHoraio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelPHora = new javax.swing.JLabel();
        textFiledPHora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textFieldMComprar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFiledCMulta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldAInicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldAFin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textFiledEInicio = new javax.swing.JTextField();
        textFiledEFin = new javax.swing.JTextField();
        botonCConfi = new javax.swing.JButton();
        botonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 241, 255));

        textFieldHInicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldHInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHInicioActionPerformed(evt);
            }
        });

        textFieldHFin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldHFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHFinActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        labelTitulo.setText("Configuracion del parqueo");

        labelHoraio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelHoraio.setText("Horario de regulacion (formato HH:mm:ss:) ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Inicio");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Fin");

        labelPHora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPHora.setText("Precio por hora");

        textFiledPHora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFiledPHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFiledPHoraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Tiempo Minimo que se puede comprar ");

        textFieldMComprar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldMComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMComprarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Costo de las multas");

        textFiledCMulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFiledCMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFiledCMultaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Agregar espacios:");

        textFieldAInicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldAInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAInicioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Inicio");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Fin");

        textFieldAFin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Eliminar espacios:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Inicio");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Fin");

        textFiledEInicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFiledEInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFiledEInicioActionPerformed(evt);
            }
        });

        textFiledEFin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFiledEFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFiledEFinActionPerformed(evt);
            }
        });

        botonCConfi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonCConfi.setText("Confirmar configuración");
        botonCConfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCConfiActionPerformed(evt);
            }
        });

        botonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelHoraio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textFiledEInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(textFiledCMulta)
                                .addComponent(textFieldHInicio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFiledPHora, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldMComprar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldAInicio))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldHFin)
                            .addComponent(textFieldAFin)
                            .addComponent(textFiledEFin, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(labelPHora))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(botonCConfi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHoraio, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldHInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldHFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(labelPHora)
                .addGap(15, 15, 15)
                .addComponent(textFiledPHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldMComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(textFiledCMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldAInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldAFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFiledEInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFiledEFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCConfi)
                .addGap(24, 24, 24))
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
    
    private void textFieldHInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHInicioActionPerformed

    private void textFieldHFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHFinActionPerformed

    private void textFiledPHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFiledPHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFiledPHoraActionPerformed

    private void textFieldAInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAInicioActionPerformed

    private void textFiledCMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFiledCMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFiledCMultaActionPerformed

    private void textFieldMComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMComprarActionPerformed

    private void textFiledEFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFiledEFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFiledEFinActionPerformed

    private void textFiledEInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFiledEInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFiledEInicioActionPerformed

    private void botonCConfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCConfiActionPerformed
        System.out.println("Cambiar confi");
    }//GEN-LAST:event_botonCConfiActionPerformed

    private void botonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBackActionPerformed
        JFrameAdmin jframeAdmin = new JFrameAdmin();
        jframeAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBackActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameConfiguracion().setVisible(true);
            }
        });
    }

//==================== Variables ==================== \\.
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBack;
    private javax.swing.JButton botonCConfi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelHoraio;
    private javax.swing.JLabel labelPHora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textFieldAFin;
    private javax.swing.JTextField textFieldAInicio;
    private javax.swing.JTextField textFieldHFin;
    private javax.swing.JTextField textFieldHInicio;
    private javax.swing.JTextField textFieldMComprar;
    private javax.swing.JTextField textFiledCMulta;
    private javax.swing.JTextField textFiledEFin;
    private javax.swing.JTextField textFiledEInicio;
    private javax.swing.JTextField textFiledPHora;
    // End of variables declaration//GEN-END:variables
}
