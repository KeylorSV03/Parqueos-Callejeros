
package com.mycompany.parqueos.callejeros;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ParqueosCallejeros {

    
    protected static Estacionamiento estacionamiento = new Estacionamiento();
    
    protected static Persona usuarioActivo = null;
    
    
    
    
    public static void main(String[] args) {
        
        //String nombre, String apellido, int telefono, String correo, String direccionFisica, String PIN, String idUsuario,Estacionamiento estacionamiento
        
        Administrador adminXDefecto = new Administrador("","",0,"","","Admin","1234",estacionamiento);
        
        Usuario usuarioXDefecto = new Usuario("", "", 0, "", "", "User", "1234",estacionamiento);
        
        Inspector inspectorXDefecto = new Inspector("","",0,"","","Inspector","1234",estacionamiento);
        
        estacionamiento.getListaUsuarios().add(adminXDefecto);
        estacionamiento.getListaUsuarios().add(usuarioXDefecto);
        estacionamiento.getListaUsuarios().add(inspectorXDefecto);
        
        JFrameInicioSesion inicioSesion = new JFrameInicioSesion();
        inicioSesion.setVisible(true);
        
    }
}
