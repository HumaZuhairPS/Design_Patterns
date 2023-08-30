package Strategy;

public class TaxiTransport implements TransportStrategy { // concrete strategies
    @Override
    public void transport() {
        System.out.println("Transport via Taxi.");
    }
}
