public class MethodPara {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Dragonball", 40);
        myMethod("One Piece", 26);
        myMethod("Black Clover", 9);
    }
}
