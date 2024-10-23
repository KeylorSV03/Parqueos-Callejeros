package com.mycompany.parqueos.callejeros;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 * 
 * @author Keylor Solano y Ariel Sanchez
 */
public class Inspector extends  Persona implements Serializable{
    
    //==================== Atributos ====================

    private List<Multa> listaMultas;
    private Estacionamiento estacionamiento;
    
    //==================== Metodos ====================
    
    // ------------------- Constructores -------------------
    
    public Inspector(String nombre, String apellido, int telefono, String correo, String direccionFisica, String idUsuario,String PIN,Estacionamiento estacionamiento){
        
        super(nombre, apellido, telefono, correo, direccionFisica, idUsuario, PIN);
        this.listaMultas = new ArrayList();
    }
    
    // ------------------- Setters -------------------
    
    public void setListaMultas(List<Multa> listaMultas){
        this.listaMultas = listaMultas;
    }
    
    public void setEstacionamiento(Estacionamiento estacionamiento){
        this.estacionamiento = estacionamiento;
    }
    
    // ------------------- Getters -------------------
    
    public List<Multa> getListaMultas(){
        return listaMultas;
    }
    
    
    
    
    public void agregarMulta (Multa multa){
        listaMultas.add(multa);
    }
    
    
    public boolean enviarCorreoMulta(String correo, String detalle, int costo, String fecha, String placa){
        if (correo == null || correo.equals("")) {
            return false; 
        }
        
        String destinatario = correo;
        String asunto = "Información de la multa:";
        String mensaje = String.format("Multa a cargo de: %s %s \n\nDetalle : %s \nPlaca: %s \nCosto: %d \nFecha: %s \n\nEsperamos que pague la multa pronto en la seccion de vehiculos",
                this.nombre, this.apellido, detalle, placa, costo, fecha);
        
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
    // --------------------------------------------------------------------------------------------------------------------------
    
        public void reporteEspacios(){
        
        byte[] pdf = ParqueosCallejeros.generatePdf("Lista de todos los espacios", estacionamiento.getListaEspacios(),Espacio::toString);
         
        if (pdf != null) {
            // Aquí puedes enviar pdfBytes por correo
            ParqueosCallejeros.enviarPdf(this.correo,"Todos los espacios", "Esta es la lista de todos los espacios del estacionamiento: ", pdf, "Todos los espacios.pdf");
        }
         
         else{
             JOptionPane.showMessageDialog(null, "No hay espacios disponibles", "No se puede generar el reporte", JOptionPane.WARNING_MESSAGE);
         }
    }
    
    
    public void reporteEspaciosDisponibles(){
        
        List<Espacio> espaciosDisponibles = new ArrayList();
        
        for(Espacio espacio : estacionamiento.getListaEspacios()){
            if(!espacio.getOcupado()){
                espaciosDisponibles.add(espacio);
            }
        }
        
        
        byte[] pdf = ParqueosCallejeros.generatePdf("Lista de espacios disponibles", espaciosDisponibles,Espacio::toString);
         
        if (pdf != null) {
            // Aquí puedes enviar pdfBytes por correo
            ParqueosCallejeros.enviarPdf(this.correo,"Espacios Disponibles", "Esta es la lista de espacios disponibles en el estacionamiento: ", pdf, "Espacios Disponibles.pdf");
        }
         
         else{
             JOptionPane.showMessageDialog(null, "No hay espacios disponibles", "No se puede generar el reporte", JOptionPane.WARNING_MESSAGE);
         }
    }
    
    public void reporteEspaciosOcupado(){
        
        List<Espacio> espaciosOcupados = new ArrayList();
        
        for(Espacio espacio : estacionamiento.getListaEspacios()){
            if(espacio.getOcupado()){
                espaciosOcupados.add(espacio);
            }
        }
        
        
        byte[] pdf = ParqueosCallejeros.generatePdf("Lista de espacios ocupados", espaciosOcupados,Espacio::toStringPCT);
         
        if (pdf != null) {
            // Aquí puedes enviar pdfBytes por correo
            ParqueosCallejeros.enviarPdf(this.correo,"Espacios Ocupados", "Esta es la lista de espacios ocupados en el estacionamiento: ", pdf, "Espacios Ocupados.pdf");
        }
         
         else{
             JOptionPane.showMessageDialog(null, "No hay espacios disponibles", "No se puede generar el reporte", JOptionPane.WARNING_MESSAGE);
         }
    }
    
    public void reporteMultas(){
        
        byte[] pdf = ParqueosCallejeros.generatePdf("Lista de multas", estacionamiento.getListaEspacios(),Espacio::toString);
         
        if (pdf != null) {
            // Aquí puedes enviar pdfBytes por correo
            ParqueosCallejeros.enviarPdf(this.correo,"Historial de multas", "Esta es la lista de multas del inspector " + nombre +" :", pdf, "ListaMultas.pdf");
        }
         
         else{
             JOptionPane.showMessageDialog(null, "No hay espacios disponibles", "No se puede generar el reporte", JOptionPane.WARNING_MESSAGE);
         }
    }
}
