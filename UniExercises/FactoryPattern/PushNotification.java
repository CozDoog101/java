package FactoryPattern;

public class PushNotification implements Message {

    @Override
    public void send(String recipient, String content) {
        System.out.println("Sending PUSH to " + recipient + ": " + content);
    }
}
