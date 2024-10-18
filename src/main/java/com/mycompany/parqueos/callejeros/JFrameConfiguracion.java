package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import com.mycompany.parqueos.callejeros.Administrador;
import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

//==================== Clase ==================== \\.

public class JFrameConfiguracion extends javax.swing.JFrame {

    private static Persona usuarioActivo = ParqueosCallejeros.usuarioActivo;
    
    
    private static Administrador admin = (Administrador) usuarioActivo;
    
    // Constructor:
    public JFrameConfiguracion() {
        initComponents();
        
        
        // Icono:
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        AjustarControles controlador = new AjustarControles();
        controlador.centrarBoton(confirmarConfiguracion);
    
        controlador.cambiarImagenBoton(botonBack, "/Imagenes/back.png");
        controlador.soloNumeros(textFieldPrecioHora);
        controlador.soloNumeros(textFieldTiempoMin);
        controlador.soloNumeros(textFieldCostoMulta);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }


//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicioElimEspacios = new PanelDegradado();
        textFieldInicioHorario = new javax.swing.JTextField();
        textFieldFinHorario = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        labelHoraio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelPHora = new javax.swing.JLabel();
        textFieldPrecioHora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textFieldTiempoMin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldCostoMulta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldInicioAgreEspacios = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldFinAgregEspacios = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textFiledInicioElim = new javax.swing.JTextField();
        textFieldFinElimEspacios = new javax.swing.JTextField();
        confirmarConfiguracion = new javax.swing.JButton();
        botonBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inicioElimEspacios.setBackground(new java.awt.Color(214, 241, 255));

        textFieldInicioHorario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldInicioHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldInicioHorarioActionPerformed(evt);
            }
        });

        textFieldFinHorario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldFinHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFinHorarioActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        labelTitulo.setText("Configuracion del parqueo");

        labelHoraio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelHoraio.setText("Horario de regulacion (formato HH:mm) ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Inicio");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Fin");

        labelPHora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPHora.setText("Precio por hora");

        textFieldPrecioHora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldPrecioHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPrecioHoraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Tiempo Minimo que se puede comprar ");

        textFieldTiempoMin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldTiempoMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTiempoMinActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Costo de las multas");

        textFieldCostoMulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldCostoMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCostoMultaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Agregar espacios:");

        textFieldInicioAgreEspacios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldInicioAgreEspacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldInicioAgreEspaciosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Inicio");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Fin");

        textFieldFinAgregEspacios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Eliminar espacios:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Inicio");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Fin");

        textFiledInicioElim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFiledInicioElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFiledInicioElimActionPerformed(evt);
            }
        });

        textFieldFinElimEspacios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldFinElimEspacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFinElimEspaciosActionPerformed(evt);
            }
        });

        confirmarConfiguracion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        confirmarConfiguracion.setText("Confirmar configuración");
        confirmarConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarConfiguracionActionPerformed(evt);
            }
        });

        botonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBackActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Nombre");

        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inicioElimEspaciosLayout = new javax.swing.GroupLayout(inicioElimEspacios);
        inicioElimEspacios.setLayout(inicioElimEspaciosLayout);
        inicioElimEspaciosLayout.setHorizontalGroup(
            inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioElimEspaciosLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioElimEspaciosLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(119, 119, 119))
            .addGroup(inicioElimEspaciosLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(confirmarConfiguracion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(inicioElimEspaciosLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(133, 133, 133))
            .addGroup(inicioElimEspaciosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioElimEspaciosLayout.createSequentialGroup()
                        .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textFiledInicioElim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(textFieldCostoMulta)
                                .addComponent(textFieldPrecioHora, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldTiempoMin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldInicioAgreEspacios))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldFinAgregEspacios)
                            .addComponent(textFieldFinElimEspacios, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioElimEspaciosLayout.createSequentialGroup()
                        .addGap(0, 81, Short.MAX_VALUE)
                        .addComponent(labelTitulo)
                        .addGap(116, 116, 116))
                    .addGroup(inicioElimEspaciosLayout.createSequentialGroup()
                        .addComponent(textFieldInicioHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldFinHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(inicioElimEspaciosLayout.createSequentialGroup()
                        .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPHora)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(labelHoraio)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(inicioElimEspaciosLayout.createSequentialGroup()
                .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        inicioElimEspaciosLayout.setVerticalGroup(
            inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioElimEspaciosLayout.createSequentialGroup()
                .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(labelHoraio, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldInicioHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldFinHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(labelPHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldPrecioHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTiempoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCostoMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldInicioAgreEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldFinAgregEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inicioElimEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFiledInicioElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldFinElimEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmarConfiguracion)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicioElimEspacios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicioElimEspacios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//==================== Funcion de control ==================== \\.
    
    private void textFieldInicioHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldInicioHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldInicioHorarioActionPerformed

    private void textFieldFinHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFinHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFinHorarioActionPerformed

    private void textFieldPrecioHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPrecioHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPrecioHoraActionPerformed

    private void textFieldInicioAgreEspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldInicioAgreEspaciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldInicioAgreEspaciosActionPerformed

    private void textFieldCostoMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCostoMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCostoMultaActionPerformed

    private void textFieldTiempoMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTiempoMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTiempoMinActionPerformed

    private void textFieldFinElimEspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFinElimEspaciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFinElimEspaciosActionPerformed

    private void textFiledInicioElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFiledInicioElimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFiledInicioElimActionPerformed

    private void confirmarConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarConfiguracionActionPerformed
        String nom = jTextFieldNombre.getText();
        String inHorario = textFieldInicioHorario.getText();
        String fHorario = textFieldFinHorario.getText();
        String precioHora = textFieldPrecioHora.getText();
        String tiepMin = textFieldTiempoMin.getText();
        String costMultas = textFieldCostoMulta.getText();
        String inicioAgreEsp = textFieldInicioAgreEspacios.getText();
        String finAgreEsp = textFieldFinAgregEspacios.getText();
        String iniElimEsp = textFieldFinElimEspacios.getText();
        String finElimEsp = textFieldFinElimEspacios.getText();
        
        boolean estado = admin.configuracion(nom, inHorario, fHorario, precioHora, tiepMin, costMultas, inicioAgreEsp, finAgreEsp, iniElimEsp, finElimEsp, this);
        if (estado){
            int opcion = JOptionPane.showConfirmDialog(this, "¿Quiere enviar correo de los cambios?", "Aviso", JOptionPane.OK_CANCEL_OPTION);
            if (opcion == JOptionPane.OK_OPTION) {
                admin.enviarCorreoConfi(inicioAgreEsp, finAgreEsp, iniElimEsp, finElimEsp);
            } 
            JOptionPane.showMessageDialog(null, "Se agregó la configuración", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_confirmarConfiguracionActionPerformed

    private void botonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBackActionPerformed
        JFrameAdmin jframeAdmin = new JFrameAdmin();
        jframeAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBackActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

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
    private javax.swing.JButton confirmarConfiguracion;
    private javax.swing.JPanel inicioElimEspacios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JLabel labelHoraio;
    private javax.swing.JLabel labelPHora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textFieldCostoMulta;
    private javax.swing.JTextField textFieldFinAgregEspacios;
    private javax.swing.JTextField textFieldFinElimEspacios;
    private javax.swing.JTextField textFieldFinHorario;
    private javax.swing.JTextField textFieldInicioAgreEspacios;
    private javax.swing.JTextField textFieldInicioHorario;
    private javax.swing.JTextField textFieldPrecioHora;
    private javax.swing.JTextField textFieldTiempoMin;
    private javax.swing.JTextField textFiledInicioElim;
    // End of variables declaration//GEN-END:variables
}
