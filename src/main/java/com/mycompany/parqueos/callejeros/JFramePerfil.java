package com.mycompany.parqueos.callejeros;


//==================== Import ==================== \\.

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;


//==================== Clase ==================== \\.

public class JFramePerfil extends javax.swing.JFrame {

    private static Utilidades controlador = new Utilidades();
    
    private static Persona usuarioActivo = ParqueosCallejeros.usuarioActivo;
    
    private static Estacionamiento estacionamiento = ParqueosCallejeros.estacionamiento;
    
    // Constructor
    public JFramePerfil() {
        initComponents();
        
        // Icono:
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        usuarioActivo = ParqueosCallejeros.usuarioActivo;
        
        controlador.cambiarImagenBoton(botonback, "/Imagenes/back.png");
        controlador.cambiarImagenBoton(botonNombre, "/Imagenes/edit.png");
        controlador.cambiarImagenBoton(botonApellidos, "/Imagenes/edit.png");
        controlador.cambiarImagenBoton(botonUser, "/Imagenes/edit.png");
        controlador.cambiarImagenBoton(botonPIN, "/Imagenes/edit.png");
        controlador.cambiarImagenBoton(botonCorreo, "/Imagenes/edit.png");
        controlador.cambiarImagenBoton(botonTelefono, "/Imagenes/edit.png");
        controlador.cambiarImagenBoton(botonDirec, "/Imagenes/edit.png");
        
        
        
        if(usuarioActivo != null){
            
            jlabelNombre.setText(usuarioActivo.getNombre());
            jLabelApellido.setText(usuarioActivo.getApellido());
            jLabelUsuario.setText(usuarioActivo.getIdUsuario());
            jLabelCorreo.setText(usuarioActivo.getCorreo());
            jLabelTelefono.setText(Integer.toString(usuarioActivo.getTelefono()));
            jLabelDireccion.setText(usuarioActivo.getDireccionFisica());
            
        }
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new PanelDegradado();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonback = new javax.swing.JButton();
        jlabelNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        botonNombre = new javax.swing.JButton();
        botonApellidos = new javax.swing.JButton();
        botonUser = new javax.swing.JButton();
        botonPIN = new javax.swing.JButton();
        botonCorreo = new javax.swing.JButton();
        botonTelefono = new javax.swing.JButton();
        botonDirec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 242, 255));
        jPanel1.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Informacion del perfil");

        botonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbackActionPerformed(evt);
            }
        });

        jlabelNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlabelNombre.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos");

        jLabelApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelApellido.setText("APELLIDO");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Id Usuario");

        jLabelUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelUsuario.setText("USER");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("PIN");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("****");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Correo");

        jLabelCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCorreo.setText("CORREO");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Telefono");

        jLabelTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTelefono.setText("TELEFONO");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("DireccionFisica");

        jLabelDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDireccion.setText("DIREC");

        botonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNombreActionPerformed(evt);
            }
        });

        botonApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonApellidosActionPerformed(evt);
            }
        });

        botonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUserActionPerformed(evt);
            }
        });

        botonPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPINActionPerformed(evt);
            }
        });

        botonCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCorreoActionPerformed(evt);
            }
        });

        botonTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTelefonoActionPerformed(evt);
            }
        });

        botonDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDirecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addComponent(botonback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jlabelNombre))
                    .addComponent(botonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabelApellido))
                    .addComponent(botonApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabelUsuario))
                    .addComponent(botonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(botonPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabelCorreo))
                    .addComponent(botonCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabelTelefono))
                    .addComponent(botonTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabelDireccion))
                    .addComponent(botonDirec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==================== Funcion de control ==================== \\.
    
    private void botonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbackActionPerformed
        
        int opcion = JOptionPane.showConfirmDialog(this, "¿Quiere enviar correo de los cambios?", "Aviso", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            usuarioActivo.enviarCorreoPerfil();
            JOptionPane.showMessageDialog(null, "Se envió el correo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } 
       
        
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
    }//GEN-LAST:event_botonbackActionPerformed

    private void botonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNombreActionPerformed
        String nuevoNombre = controlador.cambiarDato("Introduzca el nuevo nombre");
        
        if(nuevoNombre == null){
           
        }
        else if(2 < nuevoNombre.length() && nuevoNombre.length() < 20 ){
            usuarioActivo.setNombre(nuevoNombre);
            this.dispose();
            JFramePerfil jFramePerfil = new JFramePerfil();
            jFramePerfil.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "El nombre solo puede tener de 2 a 20 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_botonNombreActionPerformed

    private void botonApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonApellidosActionPerformed
        String nuevoApellido = controlador.cambiarDato("Introduzca los nuevos apellidos");
        
        if(nuevoApellido == null){
           
        }
        else if(1 < nuevoApellido.length() && nuevoApellido.length() < 40 ){
            usuarioActivo.setApellido(nuevoApellido);
            this.dispose();
            JFramePerfil jFramePerfil = new JFramePerfil();
            jFramePerfil.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Los apellidos solo puede tener de 1 a 40 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_botonApellidosActionPerformed

    private void botonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUserActionPerformed
        String nuevoUser = controlador.cambiarDato("Introduzca el nuevo Usuario");
        
        if(nuevoUser == null){
           
        }
        
        else if(estacionamiento.buscarUsuarioXid(nuevoUser)){
             JOptionPane.showMessageDialog(this, "El id de usuario no esta disponible", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        else if((2 < nuevoUser.length()) && (nuevoUser.length() < 25) ){
            usuarioActivo.setIdUsuario(nuevoUser);
            this.dispose();
            JFramePerfil jFramePerfil = new JFramePerfil();
            jFramePerfil.setVisible(true);
        }
        
        
        else{
            JOptionPane.showMessageDialog(this, "El id de usuario solo puede tener de 2 a 25 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_botonUserActionPerformed

    private void botonPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPINActionPerformed
        String actualPIN = controlador.cambiarDato("Introduzca su PIN actual");
        
        if(actualPIN == null){
           
        }
        else if (!actualPIN.equals(usuarioActivo.getPIN())){
            JOptionPane.showMessageDialog(this, "NO ES SU PIN", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
             System.out.println(actualPIN);
        }
        
        else{
            
            String nuevoPIN = controlador.cambiarDato("Nuevo PIN");
        
            if(nuevoPIN == null){

            }
            
            else if(nuevoPIN.length() == 4){
                usuarioActivo.setPIN(nuevoPIN);
                this.dispose();
                JFramePerfil jFramePerfil = new JFramePerfil();
                jFramePerfil.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "El PIN debe tener 4 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_botonPINActionPerformed

    private void botonCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCorreoActionPerformed
        String nuevoCorreo = controlador.cambiarDato("Introduzca el nuevo correo");
        System.out.println(nuevoCorreo);
        
        if(nuevoCorreo == null){
           
        }
        
        else if(estacionamiento.buscarCorreo(nuevoCorreo)){
             JOptionPane.showMessageDialog(this, "El correo esta asociado a otra cuenta", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        
        else if( estacionamiento.validarCorreo(nuevoCorreo) ){
            usuarioActivo.setCorreo(nuevoCorreo);
            this.dispose();
            JFramePerfil jFramePerfil = new JFramePerfil();
            jFramePerfil.setVisible(true);
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Correo Invalido", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_botonCorreoActionPerformed

    private void botonTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTelefonoActionPerformed
        String nuevoTelefono = controlador.cambiarDato("Introduzca el nuevo telefono");
        int nuevoTelefonoInt = 0;
        try {
            nuevoTelefonoInt = Integer.parseInt(nuevoTelefono);
            System.out.println(nuevoTelefonoInt);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Parece que hubo un error con el telefono", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }

        if( nuevoTelefonoInt ==0 || nuevoTelefonoInt < 10000000 || nuevoTelefonoInt > 99999999){
            JOptionPane.showMessageDialog(this, "Telefono invalido", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        
        else if(estacionamiento.buscarTelefono(nuevoTelefonoInt)){
             JOptionPane.showMessageDialog(this, "El telefono esta asociado a otra cuenta", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        }
        
        else{
            usuarioActivo.setTelefono(nuevoTelefonoInt);
            this.dispose();
            JFramePerfil jFramePerfil = new JFramePerfil();
            jFramePerfil.setVisible(true);
        }
        
        
    }//GEN-LAST:event_botonTelefonoActionPerformed

    private void botonDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDirecActionPerformed
        String nuevaDirec = controlador.cambiarDato("Introduzca la nueva direccion");
        System.out.println(nuevaDirec);
    }//GEN-LAST:event_botonDirecActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePerfil().setVisible(true);
            }
        });
    }

//==================== Variables ==================== \\.
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonApellidos;
    private javax.swing.JButton botonCorreo;
    private javax.swing.JButton botonDirec;
    private javax.swing.JButton botonNombre;
    private javax.swing.JButton botonPIN;
    private javax.swing.JButton botonTelefono;
    private javax.swing.JButton botonUser;
    private javax.swing.JButton botonback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel jlabelNombre;
    // End of variables declaration//GEN-END:variables
}
