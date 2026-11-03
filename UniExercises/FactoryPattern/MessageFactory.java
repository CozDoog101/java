package FactoryPattern;

public class MessageFactory {

    public static Message createMessage(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailMessage();
            case "SMS":
                return new SMSMessage();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown message type: " + type);
        }
    }
}
