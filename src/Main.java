import Singleton.DatabaseConnection;

import java.io.IOException;

public class Main extends Object {
    public static void main(String[] args) throws CloneNotSupportedException, IOException {


        // Singleton
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();

        // Prototype
//        CharacterCache characterCache = new CharacterCache();
//        characterCache.loadCache();
//
//        GameCharacter warrior = characterCache.getCharacter("warrior");
//        GameCharacter archer = characterCache.getCharacter("archer");
//        GameCharacter mage = characterCache.getCharacter("mage");
//
//        warrior.displayInfo();
//        archer.displayInfo();
//        mage.displayInfo();

        // Factory
//        PaymentFactory paymentFactory = new PayPalFactory();
//        Payment payment = paymentFactory.createPayment();
//        payment.processPayment(100.0);

        // Adapter
//        String xmlData = "<data><item>Value 1</item><item>Value 2</item></data>";
//        String filePath = "output.json";
//
//        XmlToJsonConverter xmlToJsonConverter = new XmlToJsonConverter();
//        JsonFile jsonFileAdapter = new XmlToJsonFileAdapter(xmlToJsonConverter);
//        jsonFileAdapter.saveToJsonFile(xmlData, filePath);

        // Proxy
//        BankAccount bankAccount = new BankAccount(1000);
//        ATM atm = new ATM(bankAccount);
//
//        System.out.println("Bank Account Balance: " + atm.getBalance());

        // Strategy
//        TransportService transportService = new TransportService();
//
//        transportService.setTransportStrategy(new BikeTransport());
//        transportService.transport();
//
//        transportService.setTransportStrategy(new BusTransport());
//        transportService.transport();
//
//        transportService.setTransportStrategy(new TaxiTransport());
//        transportService.transport();

        // Observer
        // Create clients (observers)
//        ClientObserver client1 = new Client("Alice");
//        ClientObserver client2 = new Client("Bob");
//        // Create online store (publisher)
//        OnlineStorePublisher store = new OnlineStorePublisher();
//        // Subscribe clients to the store's notifications
//        store.addObserver(client1);
//        store.addObserver(client2);
//        // Set iPhone availability and notify clients
//        store.setAvailableProduct("iPhone 15");



    }
}
