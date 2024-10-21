
package com.mycompany.parqueos.callejeros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Clase principal del proyecto 'Parqueos Callejeros'
 * @author Keylor Solano Vega y Ariel Sanchez Torres
 */
public class ParqueosCallejeros implements Serializable{

    
    
    // =================================== [ Variables de uso general ] ===================================
    
    protected static Estacionamiento estacionamiento = new Estacionamiento();
    
    public static Persona usuarioActivo = null;
    
    
    
    // =================================== [ Metodos ] ===================================

    /**
     * Metodo de programacion generica que carga un objeto desde un archivo
     * @param <T> 
     * @param nombreArchivo Desde cual archivo se desea cargar
     * @param clase Clase del objeto que se va a cargar
     * @return Objeto de la clase recibida por parametro
     */
    public static <T> T cargarObjeto(String nombreArchivo, Class<T> clase) {
        T objeto = null;
        try (ObjectInputStream objetoEntrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            // Intentamos leer el objeto desde el archivo
            objeto = (T) objetoEntrada.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error de entrada/salida al leer el archivo: " + nombreArchivo);
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada al deserializar el objeto.");
        }

        // Si no se pudo cargar el objeto, creamos un nuevo objeto usando el constructor por defecto
        if (objeto == null) {
            try {
                // Usamos el constructor por defecto de la clase para crear un nuevo objeto
                Constructor<T> constructor = clase.getConstructor();
                objeto = constructor.newInstance();
                System.out.println("Se ha creado un nuevo objeto de la clase: " + clase.getSimpleName());
            } catch (Exception e) {
                System.out.println("No se pudo crear un nuevo objeto: " + e.getMessage());
            }
        }

        return objeto;
    }
    
    //Cargar listas de objetos
    public static <T> List<T> cargarLista(String nombreArchivo) {
        List<T> listaObjetos = new ArrayList<>();
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaObjetos = (List<T>) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar la lista de objetos: " + e.getMessage());
        }
        return listaObjetos;
    }
    
    /**
     * Graba un objeto a un archivo
     * @param <T>
     * @param nombreArchivo Nombre del archivo en el cual se desea grabar (si no existe se crea)
     * @param objeto Cual objeto se desea grabar
     */
    public static <T> void grabarObjeto(String nombreArchivo, T objeto) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(objeto);
            System.out.println("Objeto grabado exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al grabar el objeto: " + e.getMessage());
        }
    }
    
    //Grabar listas de objetos
    public static <T> void grabarLista(String nombreArchivo, List<T> listaObjetos) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(listaObjetos);
            System.out.println("Lista de objetos grabada exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al grabar la lista de objetos: " + e.getMessage());
        }
    }
    
    
    // =================================== [ Clase principal ] ===================================
    
    public static void main(String[] args) {
        
        //Cargar el estacionamiento
        estacionamiento = cargarObjeto("estacionamiento.dat",Estacionamiento.class);

        
        
        if(estacionamiento.getListaEspacios().isEmpty()){
            
            System.out.print("La lista esta empezando vacia");
            
            //Administrador por defecto ( Para acceder y realizar la configuracion )
            Administrador adminXDefecto = new Administrador("","",0,"","","Admin","1234",estacionamiento);
        
            Usuario usuarioXDefecto = new Usuario("", "", 0, "", "", "User", "1234",estacionamiento);
        
            Inspector inspectorXDefecto = new Inspector("","",0,"","","Inspector","1234",estacionamiento);
            estacionamiento.getListaUsuarios().add(adminXDefecto);
            estacionamiento.getListaUsuarios().add(usuarioXDefecto);
            estacionamiento.getListaUsuarios().add(inspectorXDefecto);
        }
        
        
        //Ejecuta el primer JFrame ( El programa inicia con el inicio de sesion )
        JFrameInicioSesion inicioSesion = new JFrameInicioSesion();
        inicioSesion.setVisible(true);
        
        
        //Grabar los datos cuando se cierre el programa
        
         Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("El programa está por terminar. Guardando datos...");

            grabarObjeto("estacionamiento.dat", estacionamiento);

        }));
    }
}
