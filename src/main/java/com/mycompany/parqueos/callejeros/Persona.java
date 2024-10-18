
package com.mycompany.parqueos.callejeros;

import java.time.LocalDate;
import java.util.Properties;
import org.simplejavamail.email.Email;
import org.simplejavamail.mailer.Mailer;
import org.simplejavamail.mailer.MailerBuilder;

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

    // ------------------- Constructores -------------------
    
    
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

    // Otros metododos:
    
    public void enviarCorreo(){
        
    }
}


