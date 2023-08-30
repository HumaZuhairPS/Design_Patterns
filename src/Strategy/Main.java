package Strategy;

public class Main {
    public static void main(String[] args) {
        TransportService transportService = new TransportService();

        transportService.setTransportStrategy(new BikeTransport());
        transportService.transport();

        transportService.setTransportStrategy(new BusTransport());
        transportService.transport();

        transportService.setTransportStrategy(new TaxiTransport());
        transportService.transport();
    }
}
