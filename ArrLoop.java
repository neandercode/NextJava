import java.util.ArrayList;

public class ArrLoop {
    public static void main(String[] args) {
        ArrayList<String> anime = new ArrayList<String>();
        anime.add("DragonBall");
        anime.add("One Piece");
        anime.add("Black Clover");
        anime.add("Solo Leveling");
        for (int i = 0; i < anime.size(); i++) {
            System.out.println(anime.get(i));
        }
    }
}