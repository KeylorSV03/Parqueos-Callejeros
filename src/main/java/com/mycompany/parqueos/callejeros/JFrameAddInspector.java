package com.mycompany.parqueos.callejeros;

//==================== Clase ==================== \\.

public class JFrameAddInspector extends javax.swing.JFrame {

    
    public JFrameAddInspector() {
        initComponents();
        
        AjustarControles controlador = new AjustarControles();
        controlador.centrarBoton(botonAddInspector);
        controlador.centrarLabel(labelAddInspector);
        
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
        textFieldApeliidos = new javax.swing.JTextField();
        textFieldTelefono = new javax.swing.JTextField();
        textFieldCorreo = new javax.swing.JTextField();
        textFieldDireccion = new javax.swing.JTextField();
        textFieldIdUsuario = new javax.swing.JTextField();
        botonAddInspector = new javax.swing.JButton();
        passwordFieldPIN = new javax.swing.JPasswordField();

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

        textFieldApeliidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApeliidosActionPerformed(evt);
            }
        });

        botonAddInspector.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonAddInspector.setText("Agregar Inspector");
        botonAddInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddInspectorActionPerformed(evt);
            }
        });

        passwordFieldPIN.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(textFieldApeliidos)
                            .addComponent(textFieldTelefono)
                            .addComponent(textFieldCorreo)
                            .addComponent(textFieldDireccion)
                            .addComponent(textFieldIdUsuario)
                            .addComponent(passwordFieldPIN, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(botonAddInspector)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 138, Short.MAX_VALUE)
                .addComponent(labelAddInspector)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelAddInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(labelNombre)
                .addGap(18, 18, 18)
                .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldApeliidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(textFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelIdUsuario)
                .addGap(18, 18, 18)
                .addComponent(textFieldIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPIN)
                .addGap(18, 18, 18)
                .addComponent(passwordFieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(botonAddInspector)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//==================== Funcion de control ==================== \\.
    
    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void botonAddInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAddInspectorActionPerformed

    private void textFieldApeliidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldApeliidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldApeliidosActionPerformed

    
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
    private javax.swing.JTextField textFieldApeliidos;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldDireccion;
    private javax.swing.JTextField textFieldIdUsuario;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
