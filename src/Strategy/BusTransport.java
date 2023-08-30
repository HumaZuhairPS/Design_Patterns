package Strategy;

public class BusTransport implements TransportStrategy {
    @Override
    public void transport() {
        System.out.println("Transport via Bus.");
    }
}
