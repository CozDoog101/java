package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Message email = MessageFactory.createMessage("EMAIL");
        email.send("student@example.com", "Exam tomorrow!");

        Message sms = MessageFactory.createMessage("SMS");
        sms.send("+359888123456", "Your code is ready.");

        Message push = MessageFactory.createMessage("PUSH");
        push.send("Student123", "New assignment available.");
    }
}
