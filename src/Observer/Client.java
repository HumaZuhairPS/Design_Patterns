package Observer;

public class Client implements ClientObserver {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String product) {
        System.out.println(name + " : " + product + " is now available!");
    }
}
