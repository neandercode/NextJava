import java.util.ArrayList;
import java.util.Collections;

public class ArrAdd {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(42);
        myNumbers.add(13);
        myNumbers.add(64);
        myNumbers.add(33);
        myNumbers.add(77);
        myNumbers.add(3);

        Collections.sort(myNumbers);

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
