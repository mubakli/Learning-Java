package org.example;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Store;

public class Main {
    public static void main(String[] args) {
        EmailReciever emailReciever = new EmailReciever();
        try {
            // Mail sunucusuna bağlan
            Store store = session.getStore("pop3");
            store.connect(host, username, password);

            // Inbox klasörüne eriş
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            // Inbox'taki mesajları al
            Message[] messages = inbox.getMessages();
            System.out.println("Gelen kutusundaki mesajlar:");

            // Mesajları ekrana yazdır
            for (int i = 0; i < messages.length; i++) {
                Message message = messages[i];
                System.out.println("Konu: " + message.getSubject());
                System.out.println("Gönderen: " + message.getFrom()[0]);
                System.out.println("İçerik: " + message.getContent().toString());
            }

            // Bağlantıyı kapat
            inbox.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}