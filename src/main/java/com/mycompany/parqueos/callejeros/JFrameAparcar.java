package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//==================== Clase ==================== \\.

/**
 * 
 * @author ariel y keylor
 */
public class JFrameAparcar extends javax.swing.JFrame {

    private static Persona usuarioActivo = ParqueosCallejeros.usuarioActivo;
    
    private static Usuario usuario = (Usuario) usuarioActivo;
    
    private static Estacionamiento estacionamiento = ParqueosCallejeros.estacionamiento;
    
    private static Utilidades controlador = new Utilidades();
    
    
    public JFrameAparcar() {
        initComponents();
        
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        controlador.cambiarImagenBoton(botonBack, "/Imagenes/back.png");
        controlador.soloNumeros(textFieldEspacio);
        
        for(Vehiculo vehiculo : usuario.getListaVehiculos()){
            
            seleccionarVehiculo.addItem(vehiculo); 
        }
        
        for(int i = 1; i <= 20; i++){
            
            seleccionarTiempo.addItem( i * estacionamiento.getTiempoMinimo());
        }
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//==================== initComponents ==================== \\.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelDegradado();
        seleccionarVehiculo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldEspacio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        seleccionarTiempo = new javax.swing.JComboBox<>();
        botonAparcar = new javax.swing.JButton();
        botonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 238, 255));

        seleccionarVehiculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        seleccionarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarVehiculoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Aparcar");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Elegir vehiculo");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Elegir espacio");

        textFieldEspacio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Comprar tiempo");

        seleccionarTiempo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonAparcar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonAparcar.setText("Aparcar");
        botonAparcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAparcarActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seleccionarTiempo, 0, 379, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(textFieldEspacio, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(seleccionarVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(botonAparcar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seleccionarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionarTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(botonAparcar)
                .addGap(61, 61, 61))
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

    private void seleccionarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarVehiculoActionPerformed
        
    }//GEN-LAST:event_seleccionarVehiculoActionPerformed

    private void botonAparcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAparcarActionPerformed
        
        Vehiculo vehiculo = (Vehiculo )seleccionarVehiculo.getSelectedItem();
        int tiempo = (Integer) seleccionarTiempo.getSelectedItem();
        int espacio;
        if(!textFieldEspacio.getText().equals("")){
            espacio = Integer.parseInt(textFieldEspacio.getText());
        }
        else{
            espacio = 0;
        }
        
        String horaSalida = usuario.aparcar(vehiculo, tiempo, espacio, this);
        if (horaSalida != null){
            boolean estado = usuario.enviarCorreoAparcar(vehiculo, tiempo, espacio, horaSalida);
            if (estado){
                JOptionPane.showMessageDialog(null, "Se envio el correo de informacion del parqueo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_botonAparcarActionPerformed

    private void botonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBackActionPerformed
        JFrameUsuario jFrameUsuario = new JFrameUsuario();
        jFrameUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBackActionPerformed

    
//==================== Main ==================== \\.
    
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
            java.util.logging.Logger.getLogger(JFrameAparcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAparcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAparcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAparcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAparcar().setVisible(true);
            }
        });
    }
    
//==================== Variables ==================== \\.
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAparcar;
    private javax.swing.JButton botonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<Integer> seleccionarTiempo;
    private javax.swing.JComboBox<Vehiculo> seleccionarVehiculo;
    private javax.swing.JTextField textFieldEspacio;
    // End of variables declaration//GEN-END:variables
}
