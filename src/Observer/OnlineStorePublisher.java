package Observer;

import java.util.ArrayList;
import java.util.List;

public class OnlineStorePublisher {
    private List<ClientObserver> observers = new ArrayList<>();
    private String availableProduct;

    public void addObserver(ClientObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ClientObserver observer) {
        observers.remove(observer);
    }

    public void setAvailableProduct(String product) {
        this.availableProduct = product;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ClientObserver observer : observers) {
            observer.update(availableProduct);
        }
    }
}
