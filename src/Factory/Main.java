package Factory;

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PayPalFactory();
        Payment payment = paymentFactory.createPayment();
        payment.processPayment(100.0);
    }
}
