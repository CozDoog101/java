package abstraction;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        creditCard.pay(150.0);
        payPal.pay(75.5);
        creditCard.pay(-20);
        payPal.pay(0);
    }
}
