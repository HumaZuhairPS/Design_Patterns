package Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CharacterCache characterCache = new CharacterCache();
        characterCache.loadCache();

        GameCharacter warrior = characterCache.getCharacter("warrior");
        GameCharacter archer = characterCache.getCharacter("archer");
        GameCharacter mage = characterCache.getCharacter("mage");

        warrior.displayInfo();
        archer.displayInfo();
        mage.displayInfo();
    }
}
