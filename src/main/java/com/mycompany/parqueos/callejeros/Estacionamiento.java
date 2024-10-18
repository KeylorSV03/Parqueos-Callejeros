package com.mycompany.parqueos.callejeros;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Estacionamiento {
    
    //==================== Atributos ====================

    private String nombre;
    private int precioXHora = 0;
    private int tiempoMinimo = 0;
    private int costoMulta = 0;
    private int cantidadEspacios = 0;
    private List<Espacio> listaEspacios;
    private List<Multa> historialMultas;
    private List<Espacio> historialEspacios;
    private static List<Persona> listaUsuarios;
    private LocalTime[] horario;
    
    //==================== Metodos ====================
    
    // ------------------- Constructor -------------------
    
    public Estacionamiento(){
        this.listaUsuarios = new ArrayList();
        this.listaEspacios = new ArrayList();
        this.historialEspacios = new ArrayList();
        this.historialMultas = new ArrayList();
        horario = new LocalTime[2];
    }
    
    // ------------------- Setters -------------------
    
    public void setNombre(String nombre) {
    this.nombre = nombre;
}

    public void setPrecioXHora(int precioXHora) {
        this.precioXHora = precioXHora;
    }

    public void setTiempoMinimo(int tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public void setCostoMulta(int costoMulta) {
        this.costoMulta = costoMulta;
    }

    public void setCantidadEspacios(int cantidadEspacios){
        cantidadEspacios = cantidadEspacios;
        
    }
    public void setListaEspacios(List<Espacio> listaEspacios) {
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

    public void setHorario(LocalTime[] horario) {
        this.horario = horario;
    }

    // ------------------- Getters -------------------
    
    public String getNombre() {
        return nombre;
    }

    public int getPrecioXHora() {
        return precioXHora;
    }

    public int getTiempoMinimo() {
        return tiempoMinimo;
    }

    public int getCostoMulta() {
        return costoMulta;
    }

    public List<Espacio> getListaEspacios() {
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

    public LocalTime[] getHorario() {
        return horario;
    }
    
    public static boolean validarCorreo(String correo) {
        // Expresión regular para validar un correo
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    
    public static Persona verificarUsuario(String idUsuario, String pin,List<Persona> listaUsuarios, JFrame jframe){
        
        for(Persona persona:listaUsuarios){
            if(persona.getIdUsuario().equals(idUsuario)){
                
                if(persona.getPIN().equals(pin)){
                    return persona;
                }
                else{
                    JOptionPane.showMessageDialog(jframe, "Contraseña incorrecta", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }
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
        
        JOptionPane.showMessageDialog(jframe, "El usuario '" + idUsuario + "' no se encuentra registrado", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
        return null; //Si no encuentra el usuario
    }
    
    public static boolean registrarUsuario(String nombre, String apellidos, int telefono, String correo, String direccionFisica,
            String idUsuario, String PIN , List<Persona> listaUsuarios, JFrame jframe, String tipoUsuario){
        
        /*
        
        Parametro tipoUsuario
        A: Administrador
        U: Usuario
        I: Inspector
        */
        
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
        
        switch (tipoUsuario) {
            case "U":
                Usuario usuario = new Usuario(nombre,apellidos,telefono,correo,direccionFisica,idUsuario,PIN, ParqueosCallejeros.estacionamiento);
                listaUsuarios.add(usuario);
                break;
            case "A":
                {
                    Administrador admin = new Administrador(nombre,apellidos,telefono,correo,direccionFisica,idUsuario,PIN,ParqueosCallejeros.estacionamiento);
                    listaUsuarios.add(admin);
                    break;
                }
            case "I":
                { 
                    Inspector inspector = new Inspector(nombre,apellidos,telefono,correo,direccionFisica,idUsuario,PIN,ParqueosCallejeros.estacionamiento);
                    listaUsuarios.add(inspector);
                    break;
                }
            default:
                JOptionPane.showMessageDialog(jframe, "Tipo de usuario Invalido ", "Nombre de usuario no disponible", JOptionPane.WARNING_MESSAGE);
                break;
        }
        
        JOptionPane.showMessageDialog(jframe, "Usuario registrado ");
        return true;
        
    }
    
    public boolean buscarUsuarioXid(String usuario){
        for(Persona persona : this.getListaUsuarios()){
            if(persona.getIdUsuario().equals(usuario)){
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarCorreo(String correo){
        
        for(Persona persona : this.getListaUsuarios()){
            if(persona.getCorreo().equals(correo)){
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarTelefono(int telefono){
        for(Persona persona : this.getListaUsuarios()){
            if(persona.getTelefono() == telefono){
                return true;
            }
        }
        return false;
    }
    
    public  void agregarEspacio(int numeroEspacio){
        boolean existeEspacio = false;
        
        for(Espacio espacio : listaEspacios){ //Validar si el espacio existe o no
            if(espacio.getNumeroEspacio() == numeroEspacio){
                existeEspacio = true;
                break;
            }
        }
                
        if(!existeEspacio){ //si es pacio no existe se agrega
            Espacio espacio = new Espacio(numeroEspacio);
            listaEspacios.add(espacio);
                  
        }
        
        listaEspacios.sort(Comparator.comparingInt(Espacio::getNumeroEspacio)); 
        
        
                
    }
    
    public void eliminarEspacio(int numeroEspacio){
        
        for(Espacio espacio : listaEspacios){ //Validar si el espacio existe o no
            if(espacio.getNumeroEspacio() == numeroEspacio){
                listaEspacios.remove(espacio);
                break;
            }
        }
               
        
        listaEspacios.sort(Comparator.comparingInt(Espacio::getNumeroEspacio));
    }
    
    public boolean espacioLibre(int numeroEspacio){
        
        for(Espacio espacio : listaEspacios){
            if(espacio.getNumeroEspacio() == numeroEspacio){
                return true;
            }
        }
        
        return false;
    }
    
}