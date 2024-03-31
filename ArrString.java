import java.util.ArrayList;
import java.util.Collections;

public class ArrString {
    public static void main(String[] args) {
        ArrayList<String> anime = new ArrayList<String>();
        anime.add("DragonBall");
        anime.add("One Piece");
        anime.add("Black Clover");
        anime.add("Solo Leveling");
        Collections.sort(anime) ;
            for (String i : anime) {
                System.out.println(i);
            }
        
    }
}
