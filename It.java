import java.util.ArrayList;
import java.util.Iterator;

public class It {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Ford");
        cars.add("Chevy");
        cars.add("Dodge");
        cars.add("Toyota");

        Iterator<String> it = cars.iterator();
        System.out.println(it.next());
    }
}
