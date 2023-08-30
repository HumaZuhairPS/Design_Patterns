package Prototype;

import java.util.HashMap;
import java.util.Map;

public class CharacterCache {
    private Map<String, GameCharacter> characterMap = new HashMap<>();

    public GameCharacter getCharacter(String type) throws CloneNotSupportedException {
        GameCharacter cachedCharacter = characterMap.get(type);
        return (GameCharacter) cachedCharacter.clone();
    }

    public void loadCache() {
        characterMap.put("warrior", new GameCharacter("Warrior", "Melee"));
        characterMap.put("archer", new GameCharacter("Archer", "Ranged"));
        characterMap.put("mage", new GameCharacter("Mage", "Magic"));
    }
}
