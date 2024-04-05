import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("anime", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Let's watch anime!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        }   else {
            System.out.println("Match not found");
        }
    }
}
