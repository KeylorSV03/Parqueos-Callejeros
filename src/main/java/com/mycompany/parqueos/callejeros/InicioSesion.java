package com.mycompany.parqueos.callejeros;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.geom.RoundRectangle2D;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author keylo
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarImagenPanel(PanelIconLogin,"/Imagenes/UserIcon.png");
        centrarBoton(BotonIniciarSesion);
        centrarBoton(BotonRegistrarse);
        centrarLabel(LabelRegistrarse);
        centrarTextField(TextFieldUsuario);
        centrarPassField(PasswordFieldPIN);
        this.setResizable(false);
    }
    //Crear color degradado:
    
<<<<<<< HEAD:src/main/java/com/mycompany/parqueos/callejeros/Login.java
=======
    
    
    void cargarImagenPanel(JPanel panel,String nombreArchivo){
        JPanelImage mImagen = new JPanelImage(panel,nombreArchivo);
        panel.add(mImagen).repaint();
        panel.setOpaque(false);
        panel.setBorder(null);
        panel.setBackground(new Color(0, 0, 0, 0));
    }
>>>>>>> master:src/main/java/com/mycompany/parqueos/callejeros/InicioSesion.java
    
    void centrarBoton(JButton boton) {
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
  
    
    void centrarLabel(JLabel label){
         label.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    
    void centrarTextField(JTextField texto){
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    
    void centrarPassField(JPasswordField texto){
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        PanelDegradadoLogin.setBackground(new java.awt.Color(207, 234, 255));
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

        BotonIniciarSesion.setText("Iniciar Sesión");

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
                        .addGap(160, 160, 160)
                        .addComponent(PanelIconLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 121, Short.MAX_VALUE))
            .addGroup(PanelDegradadoLoginLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(PanelDegradadoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDegradadoLoginLayout.setVerticalGroup(
            PanelDegradadoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDegradadoLoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(PanelIconLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Label_IDUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(PasswordFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BotonIniciarSesion)
                .addGap(105, 105, 105)
                .addComponent(LabelRegistrarse)
                .addGap(18, 18, 18)
                .addComponent(BotonRegistrarse)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDegradadoLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDegradadoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseActionPerformed
        Registrarse JFrameRegistrarse = new Registrarse();
        JFrameRegistrarse.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonRegistrarseActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
                
            }
        });
        
        
    }

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
