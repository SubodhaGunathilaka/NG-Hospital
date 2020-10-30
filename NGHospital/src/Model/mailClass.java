/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author Asus
 */
public class mailClass {

    static String content = "";

    public mailClass(String content) 
    {
        this.content = content;
    }
     
    
    
    public static int sendMail(String recepient) throws Exception {
        System.out.println("Preparing to send email");
        Properties properties = new Properties(); //configure the properties in email
        
        properties.put("mail.smtp.auth","true");  //Authentication needed for the email
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        //identifying the email address and password
        final String myAccountEmail = "subodhagunathilaka98@gmail.com";
        final String password = "1234madu";
        
        //loging to the email
        Session session;
        session = Session.getInstance(properties,new Authenticator(){
            
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(myAccountEmail, password);
            }
            
        });
        
        //prepare the display message while sending the email
        Message message  = prepareMessage(session,myAccountEmail,recepient);
        
        Transport.send(message); //transport the data
        return 1;
        
    }

    private static Message prepareMessage(Session session,String myAccountEmail,String recepient) {
        try {
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient)); //set recepient of the message
            message.setSubject("Email from blood donation"); //message subject
            message.setText(content); //message body
            return message;
        } catch (Exception ex) {
            Logger.getLogger(mailClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
