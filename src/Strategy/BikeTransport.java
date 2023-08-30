package Strategy;

public class BikeTransport implements TransportStrategy {
    @Override
    public void transport() {
        System.out.println("Transport via Bike.");
    }
}
