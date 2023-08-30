package Strategy;

public class TransportServiceWOStrategyPattern {
    void transportBike() {
        System.out.println("transport via Bike.");
    }

    void transportBus() {
        System.out.println("transport via Bus");
    }

    void transportTaxi() {
        System.out.println("transport via Taxi");
    }

    public static void main(String[] args) {
        TransportServiceWOStrategyPattern transportService = new TransportServiceWOStrategyPattern();

        transportService.transportBike();
        transportService.transportBus();
        transportService.transportTaxi();
    }
}
