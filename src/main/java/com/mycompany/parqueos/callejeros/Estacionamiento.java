package com.mycompany.parqueos.callejeros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Estacionamiento {
    
    //==================== Atributos ====================

    private String nombre;
    private int precioXHora;
    private LocalDateTime tiempoMinimo;
    private int costoMulta;
    private int cantidadEspacios = 0;
    private Espacio listaEspacios[];
    private List<Multa> historialMultas;
    private List<Espacio> historialEspacios;
    private static List<Persona> listaUsuarios;
    private LocalDateTime[] horario = new LocalDateTime[2]; 
    
    //==================== Metodos ====================
    
    // ------------------- Constructor -------------------
    
    public Estacionamiento(){
        this.listaUsuarios = new ArrayList();
        this.listaEspacios = new Espacio[cantidadEspacios];
        this.historialEspacios = new ArrayList();
        this.historialMultas = new ArrayList();
    }
    
    // ------------------- Setters -------------------
    
    public void setNombre(String nombre) {
    this.nombre = nombre;
}

    public void setPrecioXHora(int precioXHora) {
        this.precioXHora = precioXHora;
    }

    public void setTiempoMinimo(LocalDateTime tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public void setCostoMulta(int costoMulta) {
        this.costoMulta = costoMulta;
    }

    public void setCantidadEspacios(int cantidadEspacios){
        cantidadEspacios = cantidadEspacios;
        
    }
    public void setListaEspacios(Espacio listaEspacios[]) {
        this.listaEspacios = listaEspacios;
    }

    public void setHistorialMultas(List<Multa> historialMultas) {
        this.historialMultas = historialMultas;
    }

    public void setHistorialEspacios(List<Espacio> historialEspacios) {
        this.historialEspacios = historialEspacios;
    }

    public void setListaUsuarios(List<Persona> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setHorario(LocalDateTime[] horario) {
        this.horario = horario;
    }

    // ------------------- Getters -------------------
    
    public String getNombre() {
        return nombre;
    }

    public int getPrecioXHora() {
        return precioXHora;
    }

    public LocalDateTime getTiempoMinimo() {
        return tiempoMinimo;
    }

    public int getCostoMulta() {
        return costoMulta;
    }

    public Espacio[] getListaEspacios() {
        return listaEspacios;
    }

    public List<Multa> getHistorialMultas() {
        return historialMultas;
    }

    public List<Espacio> getHistorialEspacios() {
        return historialEspacios;
    }

    public List<Persona> getListaUsuarios() {
        return listaUsuarios;
    }

    public LocalDateTime[] getHorario() {
        return horario;
    }
    
    public static boolean validarCorreo(String correo) {
        // Expresión regular para validar un correo
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    
    public static Persona verificarUsuario(String idUsuario, String pin,List<Persona> listaUsuarios ){
        
        for(Persona persona:listaUsuarios){
            if(((persona.getIdUsuario()).equals(idUsuario)) && ((persona.getPIN()).equals(pin)) && (persona instanceof Administrador)){
                return persona;
            }
            
            if(((persona.getIdUsuario()).equals(idUsuario)) && ((persona.getPIN()).equals(pin)) && (persona instanceof Usuario)){
                return persona;
            }
            
            if(((persona.getIdUsuario()).equals(idUsuario)) && ((persona.getPIN()).equals(pin)) && (persona instanceof Inspector)){
                return persona;
            }
        }
        
        return null; //Si no encuentra el usuario
    }
    
    public static boolean registrarUsuario(String nombre, String apellidos, int telefono, String correo, String direccionFisica,String idUsuario, String PIN , List<Persona> listaUsuarios, JFrame jframe){
        
        if(nombre.length() <2 ){
            JOptionPane.showMessageDialog(jframe, "El nombre tiene que tener al menos 2 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(apellidos.length() <1 ){
            JOptionPane.showMessageDialog(jframe, "Los apellidos tienen que tener al menos 1 caracter", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(telefono < 10000000 || telefono > 99999999 ){
            JOptionPane.showMessageDialog(jframe, "El numero de telefono tiene que tener 8 digitos", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(correo.length() == 0 ){
            JOptionPane.showMessageDialog(jframe, "Debe ingresar un correo electronico", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        else if(!validarCorreo(correo)){
            JOptionPane.showMessageDialog(jframe, "Correo Invalido", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(direccionFisica.length() <5 ){
            JOptionPane.showMessageDialog(jframe, "La direccion fisica debe tener al menos 5 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(idUsuario.length() <2 ){
            JOptionPane.showMessageDialog(jframe, "El id de usuario debe tener al menos 2 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(PIN.length() != 4 ){
            JOptionPane.showMessageDialog(jframe, "El PIN debe ser de 4 caracteres", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        for(Persona persona : listaUsuarios){
            
            if(persona.getTelefono() == telefono){
                
                JOptionPane.showMessageDialog(jframe, "Este numero de telefono ya esta asociado a otro usuario", "Numero de telefono no disponible", JOptionPane.WARNING_MESSAGE);
                return false;
            }
           
            if(persona.getCorreo().equals(correo)){
                
                JOptionPane.showMessageDialog(jframe, "Este correo ya esta asociado a otro usuario", "Correo no disponible", JOptionPane.WARNING_MESSAGE);
                return false;
            }
         
            if((persona.getIdUsuario()).equals(idUsuario)){
                
                JOptionPane.showMessageDialog(jframe, "Elija otro nombre de usuario ", "Nombre de usuario no disponible", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        
        Persona usuario = new Persona(nombre,apellidos,telefono,correo,direccionFisica,idUsuario,PIN);
        listaUsuarios.add(usuario);
        JOptionPane.showMessageDialog(jframe, "Usuario registrado ");
        return true;
        
    }
    
}