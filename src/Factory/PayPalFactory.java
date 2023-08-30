package Factory;

public class PayPalFactory implements PaymentFactory { // concrete factory
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
