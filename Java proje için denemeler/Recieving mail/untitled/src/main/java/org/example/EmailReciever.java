package org.example;

import java.util.Properties;
import javax.mail.*;

public class EmailReciever {

    public static void main(String[] args) {
        // Gmail hesap bilgileri
        String host = "pop.gmail.com";
        String username = "iamtheone.javaproje@gmail.com"; // Gmail adresinizi buraya yazın
        String password = "dnhz mqsf buou dfxd"; // Gmail şifrenizi buraya yazın

        // POP3 ayarları
        Properties props = new Properties();
        props.setProperty("mail.pop3.host", host);
        props.setProperty("mail.pop3.port", "995");
        props.setProperty("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.pop3.socketFactory.fallback", "false");
        Session session = Session.getDefaultInstance(props);


    }
}


