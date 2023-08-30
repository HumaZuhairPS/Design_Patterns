package Strategy;

public class TransportService { // context
    private TransportStrategy transportStrategy;

    public void setTransportStrategy(TransportStrategy strategy) {
        this.transportStrategy = strategy;
    }

    public void transport() {
        transportStrategy.transport();
    }
}
