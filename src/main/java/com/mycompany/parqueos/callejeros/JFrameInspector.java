package com.mycompany.parqueos.callejeros;

//==================== Clase ==================== \\.

public class JFrameInspector extends javax.swing.JFrame {

    
    public JFrameInspector() {
        initComponents();
        BotonImagen Boton = new BotonImagen();
        Boton.BotonImagen(botonPerfil, "/Imagenes/Perfil.png");
        Boton.BotonImagen(botonReportes, "/Imagenes/BotonReportes.png");
        Boton.BotonImagen(botonRParqueo, "/Imagenes/BotonRParqueo.png");
        Boton.BotonImagen(botonCSesion1, "/Imagenes/BotonCerrarSesion.png");
        this.setResizable(false);
    }

//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelDegradado();
        botonPerfil = new javax.swing.JButton();
        botonReportes = new javax.swing.JButton();
        botonRParqueo = new javax.swing.JButton();
        botonCSesion1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonPerfil.setText("jButton1");
        botonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(botonPerfil);

        botonReportes.setText("jButton1");
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });
        jPanel1.add(botonReportes);

        botonRParqueo.setText("jButton1");
        botonRParqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRParqueoActionPerformed(evt);
            }
        });
        jPanel1.add(botonRParqueo);

        botonCSesion1.setText("jButton1");
        botonCSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCSesionActionPerformed(evt);
            }
        });
        jPanel1.add(botonCSesion1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==================== Funcion de control ==================== \\.    

    private void botonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilActionPerformed
        System.out.println("Perfil");
    }//GEN-LAST:event_botonPerfilActionPerformed

    private void botonRParqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRParqueoActionPerformed
        System.out.println("Revisar Parqueo");
    }//GEN-LAST:event_botonRParqueoActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        System.out.println("Reportes");
    }//GEN-LAST:event_botonReportesActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInspector().setVisible(true);
            }
        });
    }

//==================== Variables ==================== \\.
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCSesion1;
    private javax.swing.JButton botonPerfil;
    private javax.swing.JButton botonRParqueo;
    private javax.swing.JButton botonReportes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
