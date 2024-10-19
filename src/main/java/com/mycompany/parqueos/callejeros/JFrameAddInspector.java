package com.mycompany.parqueos.callejeros;


//==================== Import ==================== \\.

import javax.swing.*;
import java.awt.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;


//==================== Clase ==================== \\.

public class JFrameAddInspector extends javax.swing.JFrame {

    // Constructor:
    public JFrameAddInspector() {
        initComponents();
        
        // Icono:
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        AjustarControles controlador = new AjustarControles();
        controlador.centrarBoton(botonAddInspector);
        controlador.centrarLabel(jPanel1, labelAddInspector);
        controlador.limitarCaracteres(textFieldNombre, 20);
        controlador.limitarCaracteres(textFieldApellidos, 40);
        controlador.limitarCaracteres(textFieldTelefono, 8);
        controlador.soloNumeros(textFieldTelefono);
        controlador.limitarCaracteres(textFieldDireccionFisica, 60);
        controlador.limitarCaracteres(textFieldUsuario, 25);
        controlador.limitarCaracteres(passwordFieldPIN, 4);
        controlador.cambiarImagenBoton(botonBack, "/Imagenes/back.png");
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void enviarCorreo (String nombre, String apellidos, int telefono, String correo, String direc, String idUsuario, String PIN){
        if (correo == null || correo.equals("")) {
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo porque la dirección de correo está vacía.", "Error de Envío", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        String destinatario = correo;
        String asunto = "Información de su registro de inspector:";
        String mensaje = String.format("Nombre: %s %s \nTeléfono: %d \nDirección: %s \nPIN: %s \nID Usuario: %s \nIngrese al sistema con las ultimas 2 credenciales",
                nombre, apellidos, telefono, direc, PIN, idUsuario);
    
    
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");
        
        final String usuario = "parqueoscallejeros2112@gmail.com";
        final String clave = " fqts ayqp ilcz kvrf";
        
        Session session = Session.getInstance(propiedades, new Authenticator() {
            protected  PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(usuario, clave);
            }
        });
        
        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(usuario));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            msg.setSubject(asunto);
            msg.setText(mensaje);
            
            Transport.send(msg);
            System.out.println("Correo enviado");
        }
        catch (MessagingException e){
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo a " + destinatario, "Error de Envío", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    
//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelDegradado();
        labelAddInspector = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelIdUsuario = new javax.swing.JLabel();
        labelPIN = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        textFieldApellidos = new javax.swing.JTextField();
        textFieldTelefono = new javax.swing.JTextField();
        textFieldCorreo = new javax.swing.JTextField();
        textFieldDireccionFisica = new javax.swing.JTextField();
        textFieldUsuario = new javax.swing.JTextField();
        botonAddInspector = new javax.swing.JButton();
        passwordFieldPIN = new javax.swing.JPasswordField();
        botonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(520, 680));

        labelAddInspector.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        labelAddInspector.setText("Agregar a un Inspector");

        labelNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelNombre.setText("Nombre");

        labelApellidos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelApellidos.setText("Apellidos");

        labelTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTelefono.setText("Telefono");

        labelCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelCorreo.setText("Correo");

        labelDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDireccion.setText("Direccion fisica");

        labelIdUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelIdUsuario.setText("ID de Usuario");

        labelPIN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPIN.setText("PIN");

        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });

        textFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApellidosActionPerformed(evt);
            }
        });

        botonAddInspector.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonAddInspector.setText("Agregar Inspector");
        botonAddInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddInspectorActionPerformed(evt);
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
                .addGap(14, 14, 14)
                .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(labelAddInspector)
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNombre)
                            .addComponent(labelApellidos)
                            .addComponent(labelTelefono)
                            .addComponent(labelCorreo)
                            .addComponent(labelDireccion)
                            .addComponent(labelIdUsuario)
                            .addComponent(labelPIN)
                            .addComponent(textFieldNombre)
                            .addComponent(textFieldApellidos)
                            .addComponent(textFieldTelefono)
                            .addComponent(textFieldCorreo)
                            .addComponent(textFieldDireccionFisica)
                            .addComponent(textFieldUsuario)
                            .addComponent(passwordFieldPIN, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(botonAddInspector)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAddInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelNombre)
                .addGap(18, 18, 18)
                .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTelefono)
                .addGap(18, 18, 18)
                .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCorreo)
                .addGap(18, 18, 18)
                .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldDireccionFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelIdUsuario)
                .addGap(18, 18, 18)
                .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPIN)
                .addGap(18, 18, 18)
                .addComponent(passwordFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(botonAddInspector)
                .addGap(28, 28, 28))
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
    
    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void botonAddInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddInspectorActionPerformed
        
        java.util.List<Persona> listaUsuarios = ParqueosCallejeros.estacionamiento.getListaUsuarios();
        
        String nombre = textFieldNombre.getText();
        String apellidos = textFieldApellidos.getText();
        int telefono;
        if(!textFieldTelefono.getText().equals("")){
            telefono = Integer.parseInt(textFieldTelefono.getText());
        }
        else{
            telefono = 0;
        }
        String correo = textFieldCorreo.getText();
        String direccionFisica = textFieldDireccionFisica.getText();
        String idUsuario = textFieldUsuario.getText();
        String PIN = passwordFieldPIN.getText();
        
        boolean x = Estacionamiento.registrarUsuario(nombre, apellidos, telefono, correo, direccionFisica, idUsuario, 
                PIN, listaUsuarios, this,"I");
        
        if(x){
            enviarCorreo(nombre, apellidos, telefono, correo, direccionFisica, idUsuario, PIN);
            JOptionPane.showMessageDialog(null, "Se agregó el inspector", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            JFrameAdmin jframeAdmin = new JFrameAdmin();
            jframeAdmin.setVisible(true);
            this.dispose(); 
        }
        else {
            JOptionPane.showMessageDialog(null, "No se agregó el inspector", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonAddInspectorActionPerformed

    private void textFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldApellidosActionPerformed
        
        
    }//GEN-LAST:event_textFieldApellidosActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAddInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAddInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAddInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAddInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAddInspector().setVisible(true);
            }
        });
    }

//==================== Variables ==================== \\.
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAddInspector;
    private javax.swing.JButton botonBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAddInspector;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelIdUsuario;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPIN;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JPasswordField passwordFieldPIN;
    private javax.swing.JTextField textFieldApellidos;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldDireccionFisica;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTelefono;
    private javax.swing.JTextField textFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
