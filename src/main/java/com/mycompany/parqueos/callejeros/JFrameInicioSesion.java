package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.util.List;
import javax.swing.*;
import java.awt.*;

//==================== Clase ==================== \\.

public class JFrameInicioSesion extends javax.swing.JFrame {

    // Constructor 
    public JFrameInicioSesion() {
        initComponents();
        
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        AjustarControles controlador = new AjustarControles();
        controlador.cargarImagenPanel(PanelIconLogin,"/Imagenes/UserIcon.png");
        //controlador.centrarBoton(BotonIniciarSesion);
        controlador.centrarBoton(BotonRegistrarse);
        controlador.centrarLabel(LabelRegistrarse);
        controlador.centrarTextField(TextFieldUsuario);
        controlador.limitarCaracteres(TextFieldUsuario, 25);
        controlador.centrarPassField(PasswordFieldPIN);
        controlador.limitarCaracteres(PasswordFieldPIN, 4);
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDegradadoLogin = new PanelDegradado();
        Label_IDUsuario = new javax.swing.JLabel();
        TextFieldUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PanelIconLogin = new javax.swing.JPanel();
        LabelRegistrarse = new javax.swing.JLabel();
        BotonIniciarSesion = new javax.swing.JButton();
        BotonRegistrarse = new javax.swing.JButton();
        PasswordFieldPIN = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDegradadoLogin.setBackground(new java.awt.Color(255, 255, 255));
        PanelDegradadoLogin.setPreferredSize(new java.awt.Dimension(420, 680));

        Label_IDUsuario.setText("ID Usuario");

        jLabel1.setText("PIN");

        javax.swing.GroupLayout PanelIconLoginLayout = new javax.swing.GroupLayout(PanelIconLogin);
        PanelIconLogin.setLayout(PanelIconLoginLayout);
        PanelIconLoginLayout.setHorizontalGroup(
            PanelIconLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        PanelIconLoginLayout.setVerticalGroup(
            PanelIconLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        LabelRegistrarse.setText("No tienes cuenta?");

        BotonIniciarSesion.setText("Iniciar Sesion");
        BotonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarSesionActionPerformed(evt);
            }
        });

        BotonRegistrarse.setText("Registrarse");
        BotonRegistrarse.setActionCommand("Registrate");
        BotonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDegradadoLoginLayout = new javax.swing.GroupLayout(PanelDegradadoLogin);
        PanelDegradadoLogin.setLayout(PanelDegradadoLoginLayout);
        PanelDegradadoLoginLayout.setHorizontalGroup(
            PanelDegradadoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDegradadoLoginLayout.createSequentialGroup()
                .addGroup(PanelDegradadoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDegradadoLoginLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(PanelDegradadoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_IDUsuario)
                            .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(PanelDegradadoLoginLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(PanelDegradadoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addGroup(PanelDegradadoLoginLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(LabelRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(PanelDegradadoLoginLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(PanelIconLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDegradadoLoginLayout.setVerticalGroup(
            PanelDegradadoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDegradadoLoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(PanelIconLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(Label_IDUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(PasswordFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(BotonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LabelRegistrarse)
                .addGap(18, 18, 18)
                .addComponent(BotonRegistrarse)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDegradadoLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDegradadoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//==================== Funcion de controles ==================== \\.
    
    private void BotonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseActionPerformed
        JFrameRegistrarse JFrameRegistrarse = new JFrameRegistrarse();
        JFrameRegistrarse.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonRegistrarseActionPerformed


    private void BotonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarSesionActionPerformed
        String usuario = TextFieldUsuario.getText();
        String pin = PasswordFieldPIN.getText();
        List<Persona> listaUsuarios = ParqueosCallejeros.estacionamiento.getListaUsuarios();
        Persona p = Estacionamiento.verificarUsuario(usuario,pin,listaUsuarios);
        
        if(p != null && (p instanceof Administrador)){
            
            ParqueosCallejeros.usuarioActivo = p;
            JFrameAdmin jframeAdmin = new JFrameAdmin();
            jframeAdmin.setVisible(true);
            this.setVisible(false);
        }
        
        else if(p != null && (p instanceof Usuario)){
            
            ParqueosCallejeros.usuarioActivo = p;
            JFrameUsuario jframeUsuario = new JFrameUsuario();
            jframeUsuario.setVisible(true);
            this.setVisible(false);
        }
        
        else if(p != null && (p instanceof Inspector)){
            
            ParqueosCallejeros.usuarioActivo = p;
            JFrameInspector jframeInspector = new JFrameInspector();
            jframeInspector.setVisible(true);
            this.setVisible(false);
        }
        
        else{
            JOptionPane.showMessageDialog(this, "El usuario que ingreso no se encuentra registrado", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
        }
        
        
        

    }//GEN-LAST:event_BotonIniciarSesionActionPerformed

    /**
     * @param args the command line arguments
     */

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
            java.util.logging.Logger.getLogger(JFrameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInicioSesion().setVisible(true);
                
            }
        });
        
        
        
    }

    
//==================== Variables ==================== \\.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciarSesion;
    private javax.swing.JButton BotonRegistrarse;
    private javax.swing.JLabel LabelRegistrarse;
    private javax.swing.JLabel Label_IDUsuario;
    private javax.swing.JPanel PanelDegradadoLogin;
    private javax.swing.JPanel PanelIconLogin;
    private javax.swing.JPasswordField PasswordFieldPIN;
    private javax.swing.JTextField TextFieldUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
