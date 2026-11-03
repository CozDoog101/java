package FactoryPattern;

public class EmailMessage implements Message {

    @Override
    public void send(String recipient, String content) {
        System.out.println("Sending EMAIL to " + recipient + ": " + content);
    }
}
