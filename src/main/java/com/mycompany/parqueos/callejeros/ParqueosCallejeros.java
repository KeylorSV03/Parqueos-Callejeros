/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parqueos.callejeros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author keylo
 */
public class ParqueosCallejeros {

    public static void verificarUsuario(String idUsuario, String pin,List<Administrador> listaAdmins ){
        for(Persona persona:listaAdmins){
            if(((persona.getIdUsuario()).equals(idUsuario)) && ((persona.getPIN()).equals(pin))){
                System.out.println("Si esta el usuario");
                return;
            }
        }
        System.out.println("NOOOOOO esta el usuario");
    }
    public static List<Administrador> listaAdmins = new ArrayList();
    
    public static void main(String[] args) {
        
        //String nombre, String apellido, int telefono, String correo, String direccionFisica, String PIN, String idUsuario,Estacionamiento estacionamiento
        Estacionamiento estacionamiento = new Estacionamiento();
        Administrador adminXDefecto = new Administrador("","",0,"","","1234","Admin",estacionamiento);
        
        
        listaAdmins.add(adminXDefecto);
        
        
        InicioSesion inicioSesion = new InicioSesion();
        inicioSesion.setVisible(true);
        
    }
}
