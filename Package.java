import java.util.Scanner;

 class Package {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String userName;

       System.out.println("Enter username");
       userName = myObj.nextLine();

       System.out.println("Username is: " + userName);
        myObj.close();
    }
}

/*I wanted to add that this one actually took some brain power to figure out.
 turns out you need to close the scanner once you are done but what nothing
  tells you is to name the close what you named the scanner. 
  kept getting messages sayin 'resource leak in is never closed'. */
