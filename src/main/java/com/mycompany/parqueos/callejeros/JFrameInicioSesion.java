package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//==================== Clase ==================== \\.

public class JFrameInicioSesion extends javax.swing.JFrame {

    // Constructor:
    public JFrameInicioSesion() {
        initComponents();
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        AjustarControles controlador = new AjustarControles();
        controlador.cargarImagenPanel(panelLogoUsuario,"/Imagenes/UserIcon.png");
        //controlador.centrarBoton(BotonIniciarSesion);
        controlador.centrarBoton(botonRegistrarse);
        controlador.centrarTextField(textFieldUsuario);
        controlador.limitarCaracteres(textFieldUsuario, 25);
        controlador.centrarPassField(passwordFieldPIN);
        controlador.limitarCaracteres(passwordFieldPIN, 4);
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelDegradado();
        panelLogoUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldUsuario = new javax.swing.JTextField();
        passwordFieldPIN = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        botonIniciarSesion = new javax.swing.JButton();
        botonPIN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 255, 255));

        javax.swing.GroupLayout panelLogoUsuarioLayout = new javax.swing.GroupLayout(panelLogoUsuario);
        panelLogoUsuario.setLayout(panelLogoUsuarioLayout);
        panelLogoUsuarioLayout.setHorizontalGroup(
            panelLogoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        panelLogoUsuarioLayout.setVerticalGroup(
            panelLogoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");

        textFieldUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        passwordFieldPIN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("PIN");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("No tienes cuenta?");

        botonRegistrarse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        botonIniciarSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIniciarSesion.setText("Iniciar Sesion");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        botonPIN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonPIN.setText("Olvide el PIN");
        botonPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(panelLogoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(passwordFieldPIN)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonPIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(panelLogoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(botonIniciarSesion)
                .addGap(42, 42, 42)
                .addComponent(botonPIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(botonRegistrarse)
                .addGap(34, 34, 34))
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
    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        JFrameRegistrarse JFrameRegistrarse = new JFrameRegistrarse();
        JFrameRegistrarse.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        String usuario = textFieldUsuario.getText();
        String pin = passwordFieldPIN.getText();
        List<Persona> listaUsuarios = ParqueosCallejeros.estacionamiento.getListaUsuarios();
        Persona p = Estacionamiento.verificarUsuario(usuario,pin,listaUsuarios, this);
        if(p != null && (p instanceof Administrador)){
            
            ParqueosCallejeros.usuarioActivo = p;
            JFrameAdmin jframeAdmin = new JFrameAdmin();
            jframeAdmin.setVisible(true);
            this.dispose();
        }
        
        else if(p != null && (p instanceof Usuario)){
            
            ParqueosCallejeros.usuarioActivo = p;
            JFrameUsuario jframeUsuario = new JFrameUsuario();
            jframeUsuario.setVisible(true);
            this.dispose();
        }
        
        else if(p != null && (p instanceof Inspector)){
            
            ParqueosCallejeros.usuarioActivo = p;
            JFrameInspector jframeInspector = new JFrameInspector();
            jframeInspector.setVisible(true);
            this.dispose();
        }
        
        else{
            JOptionPane.showMessageDialog(this, "El usuario que ingreso no se encuentra registrado", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void botonPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPINActionPerformed
        String usuario = textFieldUsuario.getText();
        if (usuario.equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese un usuario", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
            return;
        }
        List<Persona> listaUsuarios = ParqueosCallejeros.estacionamiento.getListaUsuarios();
        for (Persona persona: listaUsuarios){
            if (persona.getIdUsuario().equals(usuario)){
                String rand = persona.enviarCorreoPIN();
                JOptionPane.showMessageDialog(null, "Se envio el PIN de recuperación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                if (rand != null){
                    persona.setPIN(rand);
                    this.dispose();
                    JFrameInicioSesion jFrameInicioSesion = new JFrameInicioSesion();
                    jFrameInicioSesion.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_botonPINActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInicioSesion().setVisible(true);
            }
        });
    }

//==================== Variables ==================== \\.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonPIN;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelLogoUsuario;
    private javax.swing.JPasswordField passwordFieldPIN;
    private javax.swing.JTextField textFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
