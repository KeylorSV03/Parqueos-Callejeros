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
import java.time.temporal.ChronoUnit;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

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
    
    public Tarjeta getTarjeta(){
        return tarjeta;
    }
    
    // ------------------- Otros metodos -------------------
    
    public void agregarTiempoGuardado(int tiempo){
        tiempoGuardado += tiempo;
    }
    public void agregarVehiculo(String placa, String marca, String modelo, Usuario usuario){
        Vehiculo nuevoVehiculo = new Vehiculo(placa, marca, modelo, usuario);
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
    
    
    /**
     * Coloca el vehiculo en un espacio elegido por el usuario si esta disponible
     * @param vehiculo Vehiculo el cual se desea aparcar
     * @param tiempo El tiempo que se va a comprar para el uso del espacio
     * @param numeroEspacio Espacio del estacionamiento que el usuario desea utilizar
     * @param jframe donde se va a mostrar avisos
     */
    public String aparcar(Vehiculo vehiculo, int tiempoComprado, int numeroEspacio, JFrame jframe){
        
        
        if(vehiculo.getEspacio() != null){
            JOptionPane.showMessageDialog(jframe, "Este vehiculo ya esta en otro espacio ", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
            return null;
        }
        
        DateTimeFormatter formatoHHmm = DateTimeFormatter.ofPattern("HH:mm");
        
        for(Espacio espacio : estacionamiento.getListaEspacios()){

            if(espacio.getNumeroEspacio() == numeroEspacio){
                
                if(espacio.getOcupado() == false){
                    
                    espacio.setVehiculo(vehiculo); //Ingresa el vehiculo
                    espacio.setOcupado(true); //Cambia el valor de 'ocupado' indicando que ahora lo esta
                    espacio.setHoraIngreso(LocalTime.now()); //Asigna la hora de entrada al espacio
                    espacio.setHoraSalida(LocalTime.now().plusMinutes(tiempoComprado)); //Asigna la hora de salida del espacio
                    espacio.setTiempo(tiempoComprado);
                    
                    vehiculo.setEspacio(espacio); //Se le asigna el espacio al vehiculo
                    
                    String horaSalida = espacio.getHoraSalida().format(formatoHHmm);
                    JOptionPane.showMessageDialog(jframe, "Vehiculo aparcado en el espacio " + espacio.getNumeroEspacio() + 
                            "\n Su hora de salida maxima es: " + horaSalida);
                    return horaSalida;
                }
               
                else{
                    JOptionPane.showMessageDialog(jframe, "El espacio seleccionado se encuentra disponible", "Espacio ocupado", JOptionPane.WARNING_MESSAGE);
                    return null;
                }
             
            }
            
        }
        JOptionPane.showMessageDialog(jframe, "No existe el espacio", "Datos Invalidos", JOptionPane.WARNING_MESSAGE);
        return null;
    }
    
    /**
     * Este metodo permite agregar tiempo de uso de un espacio a los usuarios
     * @param vehiculo Vehiculo el cual se desea dejar mas tiempo en el estacionamiento
     * @param tiempoAdicional Cuanto tiempo se desea agregar
     * @param jframe donde se mostrara el mensaje
     */
    public String agregarTiempo(Vehiculo vehiculo, int tiempoAdicional, JFrame jframe){
        
        DateTimeFormatter formatoHHmm = DateTimeFormatter.ofPattern("HH:mm");
        
        if(vehiculo.getEspacio() != null){
            
            Espacio espacio = vehiculo.getEspacio();
            
            if(LocalTime.now().isBefore(espacio.getHoraSalida())){
                espacio.setHoraSalida(espacio.getHoraSalida().plusMinutes(tiempoAdicional));
                String nuevaHora = espacio.getHoraSalida().format(formatoHHmm);
                JOptionPane.showMessageDialog(jframe, "Se agrego el tiempo \n Su nueva hora de salida es: " + nuevaHora , "Tiempo agregado correctamente", JOptionPane.INFORMATION_MESSAGE); 
                return nuevaHora;
            }
            
            else{
                JOptionPane.showMessageDialog(jframe, "Ya se excedio el tiempo de estar en el estacionamiento", "No se puede agregar tiempo", JOptionPane.ERROR_MESSAGE); 
                return null;
            }
            
   
        }
        else{
           JOptionPane.showMessageDialog(jframe, "No se puede agregar tiempo, ya que el vehiculo seleccionado no se encuentra aparcado en ningun espacio", "Vehiculo no aparcado", JOptionPane.WARNING_MESSAGE); 
           return null;
        }
    }
    
    /**
     * Se encarga de la salida del vehiculo de un estacionamiento
     * @param vehiculo El vehiculo el cual se desea desaparcar
     * @param jframe Donde se mostrara el mensaje
     */
    public void desaparcar(Vehiculo vehiculo,JFrame jframe){
        
        if(vehiculo.getEspacio() == null){
            JOptionPane.showMessageDialog(jframe, "El vehiculo no esta en ningun espacio", "No se hizo el desaparcar", JOptionPane.WARNING_MESSAGE); 
            return;
        }
        Espacio espacio = vehiculo.getEspacio();
        int minutosRestantes = (int) LocalTime.now().until(espacio.getHoraSalida(), ChronoUnit.MINUTES);
        
        if(minutosRestantes > 0){
            JOptionPane.showMessageDialog(jframe, " Se agregaron " + minutosRestantes + " minutos a el tiempo guardado" , "Tiempo guardado", JOptionPane.INFORMATION_MESSAGE); 
            this.agregarTiempoGuardado(minutosRestantes);  
        }
        
        espacio.agregarHistorialEspacio(vehiculo);
        vehiculo.agregarHistorialEspacio(espacio);
        
        espacio.setHoraIngreso(null);
        espacio.setHoraSalida(null);
        espacio.setOcupado(false);
        espacio.setTiempo(0);
        espacio.setVehiculo(null);
        
        vehiculo.setEspacio(null);
        
        JOptionPane.showMessageDialog(jframe, " Se desaparco el vehiculo correctamente" , "Carro desaparcado", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    /**
     * Recibe un string y si tiene el formato correcto (mm-aaaa) lo convierte a un dato decla clase YearMonth 
     * @param fecha String con el formato mm-aaaa
     * @return String convertido a fechao o null si la fecha es invalida
     */
    public static YearMonth stringAFecha(String fecha) {
        // Define el formato esperado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");

        try {
            // Intenta parsear la fecha
            YearMonth yearMonth = YearMonth.parse(fecha, formatter);
            return yearMonth; // Retorna el objeto YearMonth si es válido
        } catch (DateTimeParseException e) {
            // Maneja la excepción si la fecha no es válida
            System.out.println("Fecha inválida o formato incorrecto. Debe ser mm/yyyy.");
            return null; // O lanza una excepción según tus necesidades
        }
    }
  


    /**
     * Envia correo al aparcar un vehiculo
     * @param vehiculo vehiculo que se aparco
     * @param tiempo tiempo pagado
     * @param espacio en cual esapcio se aparco
     * @param horaSalida la hora de salida
     * @return true si se envio, false si no
     */
    public boolean enviarCorreoAparcar(Vehiculo vehiculo, int tiempo, int espacio, String horaSalida){
        if (this.correo == null || this.correo.equals("")) {
            return false; 
        }
        
        String destinatario = this.correo;
        String asunto = "Información del parqueo de su vehiculo:";
        String mensaje = String.format("Vehiculo: \nPlaca: %s \nMarca: %s\nModelo: %s \nTiempo: %d mintuos \nEspacio: %d  \nHora de salida: %s",
                vehiculo.getPlaca(), vehiculo.getMarca(), vehiculo.getModelo(), tiempo, espacio, horaSalida);
        
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");
        
        final String usuario = "parqueoscallejeros2112@gmail.com";
        final String clave = " fqts ayqp ilcz kvrf";
        
        Session session = Session.getInstance(propiedades, new Authenticator() {
            protected  PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(usuario, clave);
            }
        });
        
        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(usuario));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            msg.setSubject(asunto);
            msg.setText(mensaje);
            
            Transport.send(msg);
            return true;
        }
        catch (MessagingException e){
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo a " + destinatario, "Error de Envío", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }
    
    /**
     * Envia correo al agregar tiempo
     * @param vehiculo que se agregar tiempo
     * @param tiempoAdicional que se agrega
     * @param nuevaHora de salida
     * @return true si se envio, false si no
     */
    public boolean enviarCorreoAgregarTiempo (Vehiculo vehiculo, int tiempoAdicional, String nuevaHora){
        if (this.correo == null || this.correo.equals("")) {
            return false; 
        }
        
        String destinatario = this.correo;
        String asunto = "Información del tiempo agregado:";
        String mensaje = String.format("Vehiculo: \nPlaca: %s \nMarca: %s\nModelo: %s \nTiempo Agregado: %d minutos \nNueva hora de salida: %s",
                vehiculo.getPlaca(), vehiculo.getMarca(), vehiculo.getModelo(), tiempoAdicional, nuevaHora);
        
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");
        
        final String usuario = "parqueoscallejeros2112@gmail.com";
        final String clave = " fqts ayqp ilcz kvrf";
        
        Session session = Session.getInstance(propiedades, new Authenticator() {
            protected  PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(usuario, clave);
            }
        });
        
        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(usuario));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            msg.setSubject(asunto);
            msg.setText(mensaje);
            
            Transport.send(msg);
            return true;
        }
        catch (MessagingException e){
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo a " + destinatario, "Error de Envío", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }
}
