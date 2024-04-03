import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> food = new HashSet<String>();
        food.add("Italian");
        food.add("Indian");
        food.add("Jamaican");
        food.add("Tex Mex");
        System.out.println(food.contains("Indian"));
    }
}
