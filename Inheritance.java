class Inheritance {
    protected String brand = "Anime";
    public void wifu() {
        System.out.println("UwU");
    }
}

class Show extends Inheritance {
    private String modelName = "One Piece";
    public static void main(String[] args) {
        Show myFavShow = new Show();
        myFavShow.wifu();
        System.out.println(myFavShow.brand + " " + myFavShow.modelName);
    }
}
