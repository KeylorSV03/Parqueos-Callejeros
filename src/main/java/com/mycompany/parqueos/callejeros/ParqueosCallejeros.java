/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parqueos.callejeros;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author keylo
 */
public class ParqueosCallejeros {

    public static boolean validarCorreo(String correo) {
        // Expresión regular para validar un correo
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    
    public static void verificarUsuario(String idUsuario, String pin,List<Persona> listaUsuarios ){
        for(Persona persona:listaUsuarios){
            if(((persona.getIdUsuario()).equals(idUsuario)) && ((persona.getPIN()).equals(pin))){
                System.out.println("Si esta el usuario");
                return;
            }
        }
        System.out.println("NOOOOOO esta el usuario");
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
        
        Usuario usuario = new Usuario(nombre,apellidos,telefono,correo,direccionFisica,idUsuario,PIN);
        listaUsuarios.add(usuario);
        JOptionPane.showMessageDialog(jframe, "Usuario registrado ");
        return true;
        
    }
    
    
    
    
    public static List<Persona> listaUsuarios = new ArrayList();
    
    public static void main(String[] args) {
        
        //String nombre, String apellido, int telefono, String correo, String direccionFisica, String PIN, String idUsuario,Estacionamiento estacionamiento
        Estacionamiento estacionamiento = new Estacionamiento();
        Administrador adminXDefecto = new Administrador("","",0,"","","1234","Admin",estacionamiento);
        
        
        listaUsuarios.add(adminXDefecto);
        
        
        JFrameInicioSesion inicioSesion = new JFrameInicioSesion();
        inicioSesion.setVisible(true);
        
    }
}
