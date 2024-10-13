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

    public void verificarUsuario(String idUsuario, String pin,List<Administrador> listaAdmins ){
        for(Persona persona:listaAdmins){
            if(persona.getIdUsuario() == idUsuario && persona.getPIN() == pin){
                System.out.println("Si esta el usuario");
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        //String nombre, String apellido, int telefono, String correo, String direccionFisica, String PIN, String idUsuario,Estacionamiento estacionamiento
        Estacionamiento estacionamiento = new Estacionamiento();
        Administrador adminXDefecto = new Administrador("","",0,"","","1234","Admin",estacionamiento);
        
        List<Administrador> listaAdmins = new ArrayList();
        listaAdmins.add(adminXDefecto);
        
        
        InicioSesion inicioSesion = new InicioSesion();
        inicioSesion.setVisible(true);
        
    }
}
