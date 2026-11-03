package abstraction;

public abstract class PaymentMethod {

    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount!");
            return;
        }
        processPayment(amount);
    }

    protected abstract void processPayment(double amount);
}
