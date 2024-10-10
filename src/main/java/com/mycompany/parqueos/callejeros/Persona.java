
package com.mycompany.parqueos.callejeros;
import java.time.LocalDate;

/**
 *
 * @author keylo
 */
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

    public Persona(){

    }

    public Persona(String nombre, String apellido, int telefono, String correo, String direccionFisica, String PIN, String idUsuario, LocalDate fechaIngreso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccionFisica = direccionFisica;
        this.PIN = PIN;
        this.idUsuario = idUsuario;
        this.fechaIngreso = fechaIngreso;
    }

    
}


