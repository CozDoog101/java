package abstraction;

public class CreditCard extends PaymentMethod {

    @Override
    protected void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}
