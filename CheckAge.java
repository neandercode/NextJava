public class CheckAge {
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Acces denied! - go change your huggies");
        } else {
            System.out.println("Access granted! - go on git!!");
        }
    }

    public static void main(String[] args) {
        checkAge(17);
    }
}
