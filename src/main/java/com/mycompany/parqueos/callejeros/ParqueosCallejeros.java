
package com.mycompany.parqueos.callejeros;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Phaser;
import java.util.function.Function;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
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

    
    
    
    
    
    
    
    
    
    
public static <T> byte[] generatePdf(String titulo, List<T> list, Function<T, String> toStringFunction) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    Document document = new Document();

    try {
        // Crear un PdfWriter que escriba en el ByteArrayOutputStream
        PdfWriter.getInstance(document, byteArrayOutputStream);
        document.open();

        // Agregar el título al PDF
        Paragraph titleParagraph = new Paragraph(titulo);
        titleParagraph.setAlignment(Paragraph.ALIGN_CENTER); // Centrar el título
        document.add(titleParagraph);
        document.add(new Paragraph("\n")); // Agregar un salto de línea

        // Verificar si la lista está vacía
        if (list.isEmpty()) {
            return null; // Salir del método si la lista está vacía
        }

        // Iterar sobre la lista y agregar el resultado de toStringFunction al PDF
        for (T item : list) {
            // Usar la función proporcionada para obtener la representación en cadena
            String customToString = toStringFunction.apply(item);

            // Crear un párrafo con la representación en cadena del objeto
            Paragraph paragraph = new Paragraph(customToString);
            document.add(paragraph);
            
            // Agregar un salto de línea
            document.add(new Paragraph("\n"));
        }

    } catch (DocumentException e) {
        e.printStackTrace();
        return null;
    } finally {
        // Cerrar el documento
        document.close();
    }

    // Retornar el PDF como un arreglo de bytes
    return byteArrayOutputStream.toByteArray();
}
    
    
    
    
    public static boolean enviarPdf(String destinatario, String asunto, String mensaje, byte[] pdfBytes, String nombreArchivo) {
            if (destinatario == null || destinatario.isEmpty()) {
                return false; 
            }

            Properties propiedades = new Properties();
            propiedades.put("mail.smtp.auth", "true");
            propiedades.put("mail.smtp.starttls.enable", "true");
            propiedades.put("mail.smtp.host", "smtp.gmail.com");
            propiedades.put("mail.smtp.port", "587");

            final String usuario = "parqueoscallejeros2112@gmail.com";
            final String clave = "fqts ayqp ilcz kvrf"; // Asegúrate de usar una contraseña de aplicación si es necesario

            Session session = Session.getInstance(propiedades, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario, clave);
                }
            });

            try {
                Message msg = new MimeMessage(session);
                msg.setFrom(new InternetAddress(usuario));
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
                msg.setSubject(asunto);
                msg.setText(mensaje);

                // Crear la parte del adjunto
                MimeBodyPart attachmentPart = new MimeBodyPart();
                DataSource dataSource = new ByteArrayDataSource(pdfBytes, "application/pdf");
                attachmentPart.setDataHandler(new DataHandler(dataSource));
                attachmentPart.setFileName(nombreArchivo);

                // Crear un multipart para el mensaje
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(attachmentPart);
                msg.setContent(multipart);

                // Enviar el mensaje
                Transport.send(msg);
                JOptionPane.showMessageDialog(null, "Sen envio el correo" , ".", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } catch (MessagingException e) {
                JOptionPane.showMessageDialog(null, "No se pudo enviar el correo a " + destinatario, "Error de Envío", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                return false;
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
