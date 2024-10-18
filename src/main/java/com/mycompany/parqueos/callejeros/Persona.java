package com.mycompany.parqueos.callejeros;


import java.time.LocalDate;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Persona {

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

    public void enviarCorreoPerfil(){
        
        if (this.correo == null || this.correo.equals("")) {
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo porque la dirección de correo está vacía.", "Error de Envío", JOptionPane.ERROR_MESSAGE);
            return; 
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
            System.out.println("Correo enviado");
        }
        catch (MessagingException e){
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo a " + destinatario, "Error de Envío", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    
    
    
}


