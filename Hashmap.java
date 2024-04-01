import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> mainCharacter = new HashMap<String, String>();

        mainCharacter.put("DragonBall", "Goku");
        mainCharacter.put("One Piece", "Luffy");
        mainCharacter.put("Black Clover", "Asta");
        System.out.println(mainCharacter);
    }
}
