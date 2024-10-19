package com.mycompany.parqueos.callejeros;
import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.time.YearMonth;
import java.time.format.DateTimeParseException;

public class Usuario extends Persona implements Serializable{
    
    //==================== Atributos ====================

    private Tarjeta tarjeta;
    private List<Espacio> historialEspacios;
    private List<Vehiculo> listaVehiculos;
    private Estacionamiento estacionamiento;
    private int tiempoGuardado;

    //==================== Metodos ====================
    
    // ------------------- Constructor -------------------
    
    public Usuario(String nombre, String apellido, int telefono, String correo, String direccionFisica,
            String idUsuario,String PIN,Estacionamiento estacionamiento){
        
        super(nombre, apellido, telefono, correo, direccionFisica, idUsuario, PIN);
        this.listaVehiculos = new ArrayList();
        this.historialEspacios = new ArrayList();
        this.tarjeta = null;
        this.tiempoGuardado = 0;
        this.estacionamiento = estacionamiento;
    }
    
    public List<Vehiculo> getListaVehiculos (){
        return listaVehiculos;
    }
    
    // ------------------- Setters -------------------
    
    public void setTarjeta(long numeroTarjeta, YearMonth fechaVencimiento, int codigoValidacion){
        tarjeta = new Tarjeta(numeroTarjeta, fechaVencimiento, codigoValidacion);
    }
    
    // ------------------- Getters -------------------
    
    public int getTiempoGuardado(){
        return tiempoGuardado;
    }
    
    // ------------------- Otros metodos -------------------
    
    public void agregarTiempoGuardado(int tiempo){
        tiempoGuardado += tiempo;
    }
    public void agregarVehiculo(String placa, String marca, String modelo){
        Vehiculo nuevoVehiculo = new Vehiculo(placa, marca, modelo);
        listaVehiculos.add(nuevoVehiculo);
    }
    
    public void eliminarVehiculo(Vehiculo vehiculo){
        listaVehiculos.remove(vehiculo);
    }
    
    
    public Vehiculo buscarVehiculo(int indice){
        if (listaVehiculos == null){
            return null;
        }
        int contador = 0;
        for (Vehiculo vehiculo: listaVehiculos){
            if (contador == indice){
                return vehiculo;
            }
            contador++;
        }
        return null;
    }
    
    public boolean buscarVehiculoXP(String placa){
        if (listaVehiculos == null){
            return false;
        }
        for (Vehiculo vehiculo: listaVehiculos){
            if (vehiculo.getPlaca().equals(placa)){
                return true;
            } 
        }
        return false;
    }
    
    public Vehiculo buscarVehiculoReturn(String placa){
        if (listaVehiculos == null){
            return null;
        }
        for (Vehiculo vehiculo: listaVehiculos){
            if (vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            } 
        }
        return null;
    }
    
    
    public void aparcar(Vehiculo vehiculo, int tiempo, int numeroEspacio, JFrame jframe){
        
        
        if(vehiculo.getEspacio() != null){
            JOptionPane.showMessageDialog(jframe, "Este vehiculo ya esta en otro espacio ", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(Espacio espacio : estacionamiento.getListaEspacios()){

            if(espacio.getNumeroEspacio() == numeroEspacio){
                
                if(espacio.getOcupado() == false){
                    espacio.setVehiculo(vehiculo);
                    espacio.setOcupado(true);
                    espacio.setInicioParqueo(LocalTime.now());
                    vehiculo.setEspacio(espacio);
                    espacio.setTiempo(tiempo);
                    LocalTime horaSalida = LocalTime.now().plusMinutes(tiempo);
                    DateTimeFormatter formatoHHmm = DateTimeFormatter.ofPattern("HH:mm");
                    JOptionPane.showMessageDialog(jframe, "Vehiculo aparcado en el espacio " + espacio.getNumeroEspacio() + 
                            "\n Su hora de salida maxima es: " + horaSalida.format(formatoHHmm));
                    return;
                }
               
                else{
                    JOptionPane.showMessageDialog(jframe, "El espacio no esta disponible", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
                    return;
                }
             
            }
            
        }
        JOptionPane.showMessageDialog(jframe, "No existe el espacio", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    public YearMonth stringAFecha(String fecha) {
        // Definir el formato MM-AAAA
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-uuuu");
        
        try {
            // Intentar parsear la cadena a YearMonth
            YearMonth fechaDeVencimiento = YearMonth.parse(fecha, formatter);
            // Si llega aquí, la fecha es válida
            return fechaDeVencimiento;
        } catch (DateTimeParseException e) {
            // Si el formato o la fecha son inválidos, mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "La fecha '" + fecha + "' no es válida o tiene un formato incorrecto.\nEl formato debe ser MM-AAAA.", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }


}
