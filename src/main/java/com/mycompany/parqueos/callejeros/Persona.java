package com.mycompany.parqueos.callejeros;

//==================== Import ==================== \\.

import java.io.Serializable;
import java.time.LocalDate;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.swing.JOptionPane;
import java.util.Random;


//==================== Clase ==================== \\.


public class Persona implements Serializable{

    //==================== Atributos ====================

    protected String nombre;
    protected String apellido;
    protected int telefono;
    protected String correo;
    protected String direccionFisica;
    protected String PIN;
    protected String idUsuario;
    protected LocalDate fechaIngreso;

    //==================== Metodos ====================

    // Constructor
    
    
    public Persona(){

    }

    /**
     * constructor de persona 
     * @param nombre
     * @param apellido
     * @param telefono
     * @param correo
     * @param direccionFisica
     * @param idUsuario
     * @param PIN 
     */
    public Persona(String nombre, String apellido, int telefono, String correo, String direccionFisica, String idUsuario,String PIN){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccionFisica = direccionFisica;
        this.PIN = PIN;
        this.idUsuario = idUsuario;
        this.fechaIngreso = LocalDate.now();
    }

    // ------------------- Setters -------------------
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccionFisica(String direccionFisica) {
        this.direccionFisica = direccionFisica;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    // ------------------- Getters -------------------
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccionFisica() {
        return direccionFisica;
    }

    public String getPIN() {
        return PIN;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Envia correo del perfil a cada usuario
     * @return true si se envio, false si no
     */
    public boolean enviarCorreoPerfil(){
        
        if (this.correo == null || this.correo.equals("")) {
            return false; 
        }
        
        String destinatario = this.correo;
        String asunto = "Información de la persona:";
        String mensaje = String.format("Nombre: %s %s\nTeléfono: %d\nDirección: %s\nPIN: %s\nID Usuario: %s\nFecha de Ingreso: %s",
                this.nombre, this.apellido, this.telefono, this.direccionFisica, this.PIN, this.idUsuario, this.fechaIngreso);
        
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
            return true;
        }
        catch (MessagingException e){
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo a " + destinatario, "Error de Envío", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }
    
    /**
     * Envia correo para el cambio de PIN
     * @return true si se envio, false si no
     */
    public String enviarCorreoPIN(){
        if (this.correo == null || this.correo.equals("")) {
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo porque la dirección de correo está vacía.", "Error de Envío", JOptionPane.ERROR_MESSAGE);
            return null; 
        }
        
        String destinatario = this.correo;
        String asunto = "Cambio de PIN:";
        String rand = generarCadenaAleatoria();
        String mensaje = String.format("Nuevo PIN (temporal): %s", rand);
        
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");
        
        final String usuario = "parqueoscallejeros2112@gmail.com";
        final String clave = "fqts ayqp ilcz kvrf";
        
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
            return rand;
        }
        catch (MessagingException e){
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo a " + destinatario, "Error de Envío", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Genera un codigo aleatorio para el cambio de PIN
     * @return el codigo generado
     */
    public static String generarCadenaAleatoria () {
        String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // caracteres disponibles
        StringBuilder cadena = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < 4; i++){
            int j = random.nextInt(caracteresValidos.length());
            cadena.append(caracteresValidos.charAt(j));
        }
        
        return cadena.toString();
    }
    
    public String toString(){
        return "Nombre: " + nombre + "\n" +
                "Id Usuario: " + idUsuario +"\n";
    }
}


