package Observer;

public class Main {
    public static void main(String[] args) {
        // Create clients (observers)
        ClientObserver client1 = new Client("Alice");
        ClientObserver client2 = new Client("Bob");
        // Create online store (publisher)
        OnlineStorePublisher store = new OnlineStorePublisher();
        // Subscribe clients to the store's notifications
        store.addObserver(client1);
        store.addObserver(client2);
        // Set iPhone availability and notify clients
        store.setAvailableProduct("iPhone 15");
    }
}
