package FactoryPattern;

public class SMSMessage implements Message {

    @Override
    public void send(String recipient, String content) {
        System.out.println("Sending SMS to " + recipient + ": " + content);
    }
}
