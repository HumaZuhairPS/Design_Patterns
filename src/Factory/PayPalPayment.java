package Factory;

public class PayPalPayment implements Payment { // concrete product
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
