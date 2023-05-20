import java.util.Scanner;

public class AviationObject{

    String Choice;
    String userName;
    int Password;

    private static AviationObject instance = new AviationObject();

    private AviationObject(){

    }

    public static AviationObject getInstance(){
        return instance;
    }

    public void Market1(int Choice, String userName, int Password){

        System.out.println("You are now logged in as: " +userName);
        System.out.println(" ");
        
        Scanner in = new Scanner(System.in);

        int stock = 5619;

        System.out.println("                                  ------ Welcome to Airbus Manufacturers Pvt. Ltd. ------");
        System.out.println(" ");
        System.out.println("Number of pieces available aircrafts: " +stock);
        System.out.println(" ");
        System.out.println("Please enter the number of aircrafts you wish to buy: ");
        int order = in.nextInt();
        System.out.println("Congratulations!! The order has been placed.");
        System.out.println("Updated stock: " +(stock-order));
        System.out.println(" ");
        System.out.println("Thank you for shopping with us!");
        System.out.println(" ");
    }

    public void Market2(int Choice, String userName, int Password){

        System.out.println("You are now logged in as: " +userName);
        System.out.println(" ");

        Scanner in = new Scanner(System.in);

        int stock = 4352;

        System.out.println("                                  ------ Welcome to Boeing Aeronautics Pvt. Ltd. ------");
        System.out.println(" ");
        System.out.println("Number of pieces available aircrafts: " +stock);
        System.out.println(" ");
        System.out.println("Please enter the number of aircrafts you wish to buy: ");
        int order = in.nextInt();
        System.out.println("Congratulations!! The order has been placed.");
        System.out.println("Updated stock: " +(stock-order));
        System.out.println(" ");
        System.out.println("Thank you for shopping with us!");
        System.out.println(" ");
            
    }

}