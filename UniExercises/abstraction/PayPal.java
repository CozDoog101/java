package abstraction;

public class PayPal extends PaymentMethod {

    @Override
    protected void processPayment(double amount) {
        System.out.println("Processing PayPal payment: " + amount);
    }
}
