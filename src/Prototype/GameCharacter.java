package Prototype;

public class GameCharacter implements Cloneable{
    private String name;
    private String type;

    public GameCharacter(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Type: " + type);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


