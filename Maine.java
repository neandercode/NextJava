import java.util.Scanner;

public class Maine {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter Username:");

            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        }
    }
}
