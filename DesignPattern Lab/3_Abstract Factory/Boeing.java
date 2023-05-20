import java.util.Scanner;

public class Boeing implements Commercial{

    int stock = 300;
    int deldate = 43;
    
    public void Commercial(){
        
        Scanner in = new Scanner(System.in);

        System.out.println("----Welcome to the official website of Boeing Aerospace Limited.----");
        
        System.out.println("The number of aircrafts available: " +stock);

        System.out.println("Enter the number of aircrafts you wish to order: ");
        int n = in.nextInt();

        System.out.println("The aircrafts will be delivered to you in " +deldate +" days.");

        stock = stock-n;
        System.out.println("Number of aircrafts now available: " +stock);

    }
}
