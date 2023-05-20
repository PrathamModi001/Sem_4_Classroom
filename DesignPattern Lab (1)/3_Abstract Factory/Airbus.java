import java.util.Scanner;

public class Airbus implements Commercial{

    int stock = 247;
    int deldate = 21;
    
    public void Commercial(){
        
        Scanner in = new Scanner(System.in);

        System.out.println("----Welcome to the official website of Airbus Aviation Limited.----");
        
        System.out.println("The number of aircrafts available: " +stock);

        System.out.println("Enter the number of aircrafts you wish to order: ");
        int n = in.nextInt();

        System.out.println("The part will be delivered to you in " +deldate +" days.");

        stock = stock-n;
        System.out.println("Number of aircrafts now available: " +stock);

    }
}
