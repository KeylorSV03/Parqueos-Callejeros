
package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.awt.Image;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//==================== Clase ==================== \\.

/**
 *
 * @author ariel
 */
public class JFrameRevisarParqueo extends javax.swing.JFrame {

    private static Utilidades controlador = new Utilidades();
    
    private static Persona usuarioActivo = ParqueosCallejeros.usuarioActivo;
    
    private static Inspector inspector = (Inspector) usuarioActivo;
    
    private static Estacionamiento estacionamiento = ParqueosCallejeros.estacionamiento;
    
    private static Vehiculo vehiculo;
    
    /**
     * Creates new form JFrameRevisarParqueo
     */
    public JFrameRevisarParqueo() {
        initComponents();
        
         // Icono:
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/logoCar.png")).getImage();
        setIconImage(icono);
        
        controlador.cambiarImagenBoton(botonBack, "/Imagenes/back.png");
        controlador.soloNumeros(textFieldEspacio);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldEspacio = new javax.swing.JTextField();
        botonRevisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonGenerarMulta = new javax.swing.JButton();
        labelPlaca = new javax.swing.JLabel();
        labelPagado = new javax.swing.JLabel();
        botonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Revisar parqueo");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Numero de espacio a revisar");

        textFieldEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEspacioActionPerformed(evt);
            }
        });

        botonRevisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonRevisar.setText("Revisar");
        botonRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRevisarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Placa");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Pagado");

        botonGenerarMulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonGenerarMulta.setText("Generar multa");
        botonGenerarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarMultaActionPerformed(evt);
            }
        });

        labelPlaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPlaca.setText("placa");

        labelPagado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPagado.setText("pagado");

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
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(labelPlaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(labelPagado))
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonRevisar)
                        .addGap(210, 210, 210))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(botonGenerarMulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(botonRevisar)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(labelPagado))
                .addGap(92, 92, 92)
                .addComponent(botonGenerarMulta)
                .addGap(112, 112, 112))
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
    
    private void textFieldEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEspacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEspacioActionPerformed

    /**
     * Revisa el parqueo para poder generar una multa
     * @param evt 
     */
    private void botonRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRevisarActionPerformed
        List<Espacio> listaEspacios = estacionamiento.getListaEspacios();
        int numeroEspacio = Integer.parseInt(textFieldEspacio.getText());
        
        for (Espacio espacio: listaEspacios){
            if (espacio.getNumeroEspacio() == numeroEspacio){
                if (espacio.getOcupado()){
                    vehiculo = espacio.getVehiculo();
                    labelPlaca.setText(vehiculo.getPlaca());
                    String pagado;
                    if (LocalTime.now().isBefore(espacio.getHoraSalida())){
                        pagado = "SI";
                    }
                    else {
                        pagado = "NO";
                    }
                    labelPagado.setText(pagado);
                    JOptionPane.showMessageDialog(null, "Se encontro un vehiculo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                else {
                    int opcion = JOptionPane.showConfirmDialog(null, "En el app esta vacio ¿Quiere hacer la multa? ", "Confirmación", JOptionPane.OK_CANCEL_OPTION);
                        
                    if (opcion == JOptionPane.OK_OPTION) {
                        int costo = estacionamiento.getCostoMulta();
            
                        DateTimeFormatter formatoHHmm = DateTimeFormatter.ofPattern("HH:mm");
                        String fechaActual = LocalTime.now().format(formatoHHmm);
                        System.out.println(fechaActual);
                        String detalle = "Sigue en el espacio despues del tiempo pagado";
            
                        Multa multa = new Multa(costo, fechaActual, vehiculo.getPlaca(), detalle);
                        estacionamiento.agregarIngresoMulta(costo);
                        estacionamiento.agregarMulta(multa);
                        JOptionPane.showMessageDialog(null, "Se hizo la multa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    } else if (opcion == JOptionPane.CANCEL_OPTION) {
                        return;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(this, "El espacio no fue encontrado", "Mensaje", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_botonRevisarActionPerformed

    /**
     * vuelve atras
     * @param evt 
     */
    private void botonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBackActionPerformed
        JFrameInspector jFrameInspector = new JFrameInspector();
        jFrameInspector.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBackActionPerformed

    /**
     * Despues de buscar el espacio, sale la placa y si ah pagado o no
     * @param evt 
     */
    private void botonGenerarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarMultaActionPerformed
        if ((labelPagado.getText().equals("SI")) || (labelPagado.getText().equals("pagado"))){
            JOptionPane.showMessageDialog(this, "No puede generar multa ya que esta pagado");
        }
        else {
            int costo = estacionamiento.getCostoMulta();
            
            DateTimeFormatter formatoHHmm = DateTimeFormatter.ofPattern("HH:mm");
            String fechaActual = LocalTime.now().format(formatoHHmm);
            String detalle = "Sigue en el espacio despues del tiempo pagado";
            
            Multa multa = new Multa(costo, fechaActual, vehiculo.getPlaca(), detalle);
            vehiculo.agregarMulta(multa);
            List<Multa> multas = inspector.getListaMultas();
            multas.add(multa);
            
            String correoUsuario = (vehiculo.getPropietario()).getCorreo();
            boolean estado = inspector.enviarCorreoMulta(correoUsuario, detalle, costo, fechaActual, labelPlaca.getText());
            if (estado){
                JOptionPane.showMessageDialog(null, "Se envió el correo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_botonGenerarMultaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameRevisarParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRevisarParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRevisarParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRevisarParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRevisarParqueo().setVisible(true);
            }
        });
    }

//==================== Variables ==================== \\.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBack;
    private javax.swing.JButton botonGenerarMulta;
    private javax.swing.JButton botonRevisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPagado;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JTextField textFieldEspacio;
    // End of variables declaration//GEN-END:variables
}
