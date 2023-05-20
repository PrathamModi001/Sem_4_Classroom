import java.util.Scanner;

public class Northrop implements Defense{

    int stock = 542;
    int deldate = 68;
    
    public void Defense(){
        
        Scanner in = new Scanner(System.in);

        System.out.println("----Welcome to the official website of Northrop Grumman Limited.----");
        
        System.out.println("The number of aircrafts available: " +stock);

        System.out.println("Enter the number of aircrafts you wish to order: ");
        int n = in.nextInt();

        System.out.println("The part will be delivered to you in " +deldate +" days.");

        stock = stock-n;
        System.out.println("Number of aircrafts now available: " +stock);

    }
}
