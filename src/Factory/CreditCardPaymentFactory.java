package Factory;

public class CreditCardPaymentFactory implements PaymentFactory { // concrete factory
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
