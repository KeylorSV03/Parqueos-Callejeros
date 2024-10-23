package com.mycompany.parqueos.callejeros;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Estacionamiento implements Serializable {
    
    //==================== Atributos ====================

    private String nombre;
    private int precioXHora = 0;
    private int tiempoMinimo = 0;
    private int costoMulta = 0;
    private int cantidadEspacios = 0;
    private List<Espacio> listaEspacios;
    private List<Multa> historialMultas;
    private List<Espacio> historialEspacios;
    private List<Persona> listaUsuarios;
    private LocalTime[] horario;
    private int ingresoMultas;
    
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
    
    public int getIngresoMultas() {
        return ingresoMultas;
    }
    
    
    // ------------------- Otros metodos -------------------
    
    public void agregarIngresoMulta (int ingresos){
        ingresoMultas += ingresos;
    }
    
    public void agregarMulta (Multa multa){
        historialMultas.add(multa);
    }
    
    public void agregarMulta (List<Multa> multas){
        historialMultas.addAll(multas);
    }
    
    
    public static boolean validarCorreo(String correo) {
        // Expresión regular para validar un correo
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    
    
    /**
     * Busca a el usuariosegun el id y su pin
     * @param idUsuario Identificacion de usuario insertada para iniciar sesion
     * @param pin PIN insertado para iniciar sesion
     * @param listaUsuarios Lista donde se va a buscar el usuario
     * @param jframe JFrame donde se mostrara el mensaje en caso de datos incorrectos
     * @return Un usuario para usarlo en las operaciones de la aplicacion
     */
    public static Persona verificarUsuario(String idUsuario, String pin,List<Persona> listaUsuarios, JFrame jframe){
        
        for(Persona persona:listaUsuarios){
            if(persona.getIdUsuario().equals(idUsuario)){
                
                if(persona.getPIN().equals(pin)){
                    return persona;
                }
                else{
                    JOptionPane.showMessageDialog(jframe, "Contraseña incorrecta", "Datos invalidos", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
            }
           
        }
        
        JOptionPane.showMessageDialog(jframe, "El usuario '" + idUsuario + "' no se encuentra registrado", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
        return null; //Si no encuentra el usuario
    }
    
    
     /**
      * Recibe la informacion del usuario y si es correcta se agrega a la lista de usuarios
      * @param nombre String de 2 a 20 caracteres
      * @param apellidos String de 1 a 40 caracteres
      * @param telefono Entero de 8 digitos
      * @param correo String con el formato parte1@parte2
      * @param direccionFisica String de 5 a 60 caracteres
      * @param idUsuario String de 2 a 25 caracteres (se usa para iniciar sesion)
      * @param PIN String de 4 caracteres (se usa para iniciar sesion)
      * @param listaUsuarios La lista donde se agregara el usuario
      * @param jframe JFrame en el cual se mostraran mensaje si hay datos erroneos
      * @param tipoUsuario A si se agregara un Administrador, U si sera un usuario o I en caso de inspector
      * @return True si se puedo registar el usuario(si todos los datos fueron correctos) y false de lo contario
      */
    public static boolean registrarUsuario(String nombre, String apellidos, int telefono, String correo, String direccionFisica,
            String idUsuario, String PIN , List<Persona> listaUsuarios, JFrame jframe, String tipoUsuario){
        
        /*
        Parametro tipoUsuario
        A: Administrador
        U: Usuario
        I: Inspector
        */
        
        
        if(nombre.length() <2 ){
            JOptionPane.showMessageDialog(jframe, "El nombre tiene que tener al menos 2 caracteres", "Datos Invalidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(apellidos.length() <1 ){
            JOptionPane.showMessageDialog(jframe, "Los apellidos tienen que tener al menos 1 caracter", "Datos Invalidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(telefono < 10000000 || telefono > 99999999 ){
            JOptionPane.showMessageDialog(jframe, "El numero de telefono tiene que tener 8 digitos", "Datos Invalidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(correo.length() == 0 ){
            JOptionPane.showMessageDialog(jframe, "Debe ingresar un correo electronico", "Datos Invalidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        else if(!validarCorreo(correo)){
            JOptionPane.showMessageDialog(jframe, "Correo Invalido", "Datos Invalidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(direccionFisica.length() <5 ){
            JOptionPane.showMessageDialog(jframe, "La direccion fisica debe tener al menos 5 caracteres", "Datos Invalidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(idUsuario.length() <2 ){
            JOptionPane.showMessageDialog(jframe, "El id de usuario debe tener al menos 2 caracteres", "Datos Invalidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(PIN.length() != 4 ){
            JOptionPane.showMessageDialog(jframe, "El PIN debe ser de 4 caracteres", "Datos Invalidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        for(Persona persona : listaUsuarios){
            
            if(persona.getTelefono() == telefono){
                
                JOptionPane.showMessageDialog(jframe, "Este numero de telefono ya esta asociado a otro usuario", "Numero de telefono no disponible", JOptionPane.ERROR_MESSAGE);
                return false;
            }
           
            if(persona.getCorreo().equals(correo)){
                
                JOptionPane.showMessageDialog(jframe, "Este correo ya esta asociado a otro usuario", "Correo no disponible", JOptionPane.ERROR_MESSAGE);
                return false;
            }
         
            if((persona.getIdUsuario()).equals(idUsuario)){
                
                JOptionPane.showMessageDialog(jframe, "Elija otro nombre de usuario ", "Nombre de usuario no disponible", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(jframe, "Tipo de usuario Invalido ", "Datos Invalidos", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
        JOptionPane.showMessageDialog(jframe, "Usuario registrado ");
        return true;
        
    }
    
    
    /**
     * Busca un usuario en la lista segun su identificacion
     * @param usuario Identificacion que se va a buscar
     * @return True si lo encontro, false de lo contrario
     */
    public boolean buscarUsuarioXid(String usuario){
        for(Persona persona : this.getListaUsuarios()){
            if(persona.getIdUsuario().equals(usuario)){
                return true;
            }
        }
        return false;
    }
    
    
    /**
     * Busca el correo electronico recibido en cada usuario para asegurarse que no haya correos repetidos(se usa a la hora de registar un usuario)
     * @param correo Correo a buscar
     * @return True si lo encontro, false de lo contrario
     */
    public boolean buscarCorreo(String correo){
        
        for(Persona persona : this.getListaUsuarios()){
            if(persona.getCorreo().equals(correo)){
                return true;
            }
        }
        return false;
    }
    
    
    /** 
     * Busca el telefono recibido en cada usuario para verificar que no hayan telefonos repetidos (se usa a la hora de registrar un usuario)
     * @param telefono Numero de telefono a buscar
     * @return True si lo encontro, false de lo contrario
     */
    public boolean buscarTelefono(int telefono){
        for(Persona persona : this.getListaUsuarios()){
            if(persona.getTelefono() == telefono){
                return true;
            }
        }
        return false;
    }
    
    
    /**
     * Agrega un espacio al estacionamiento. Si el numero de espacio no existe lo agrega, si ya existe no se realiza la accion
     * @param numeroEspacio Nuemero de espacio que se desea agregar al estacionamiento
     */
    public  void agregarEspacio(int numeroEspacio){
        
        if(numeroEspacio <= 0){
            JOptionPane.showMessageDialog(null, "No se agrego el espacio '" + numeroEspacio + "' , el numero de espacio debe ser mayor a 0", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        
        boolean existeEspacio = false;
        
        for(Espacio espacio : listaEspacios){ //Validar si el espacio existe o no
            if(espacio.getNumeroEspacio() == numeroEspacio){
                existeEspacio = true;
                break;
            }
        }
                
        if(!existeEspacio && numeroEspacio >0){ //si el espacio no existe se agrega
            Espacio espacio = new Espacio(numeroEspacio);
            listaEspacios.add(espacio);   
        }
        
        else{
            JOptionPane.showMessageDialog(null, "No se agrego el espacio '" + numeroEspacio + "' porque ya existe", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        listaEspacios.sort(Comparator.comparingInt(Espacio::getNumeroEspacio)); 
                  
    }
    
    
    /**
     * Elimina un espacio del parqueo si existe, si no existe se notifica.
     * @param numeroEspacio Numero de espacio que se desea eliminar del parqueo
     */
    public void eliminarEspacio(int numeroEspacio){
        
        
        boolean existeEspacio = false;
        
        for(Espacio espacio : listaEspacios){ //Validar si el espacio existe o no
            if(espacio.getNumeroEspacio() == numeroEspacio){
                listaEspacios.remove(espacio);
                existeEspacio = true;
                break;
            }
        }
        
        if(!existeEspacio && numeroEspacio > 0){
            JOptionPane.showMessageDialog(null, "No se elimino el espacio '" + numeroEspacio + "' porque no existe", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
               
        
        listaEspacios.sort(Comparator.comparingInt(Espacio::getNumeroEspacio));
    }
    
    
    /**
     * Busca el numero de espacion ingresado a ver si esta libre
     * @param numeroEspacio Numero de espacio a consultar
     * @return True si esta libre, false de lo contrario
     */
    public boolean espacioLibre(int numeroEspacio){
        
        for(Espacio espacio : listaEspacios){
            if(espacio.getNumeroEspacio() == numeroEspacio){
                return true;
            }
        }
        
        return false;
    }
    
}