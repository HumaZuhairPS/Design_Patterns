package Factory;

public class CreditCardPayment implements Payment { // concrete product
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
