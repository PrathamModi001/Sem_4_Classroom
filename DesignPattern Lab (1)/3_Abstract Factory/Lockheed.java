import java.util.Scanner;

public class Lockheed implements Defense{

    int stock = 456;
    int deldate = 59;
    
    public void Defense(){
        
        Scanner in = new Scanner(System.in);

        System.out.println("----Welcome to the official website of Lockheed Martin Limited.----");
        
        System.out.println("The number of aircrafts available: " +stock);

        System.out.println("Enter the number of aircrafts you wish to order: ");
        int n = in.nextInt();

        System.out.println("The part will be delivered to you in " +deldate +" days.");

        stock = stock-n;
        System.out.println("Number of aircrafts now available: " +stock);

    }
}
