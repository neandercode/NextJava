import java.util.HashMap;

public class HashMapDos {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 35);

        for (String i : people.keySet()) {
            System.out.println("Key: " + i + " value: " + people.get(i));
        }
    }
}
