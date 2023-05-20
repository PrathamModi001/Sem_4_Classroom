
import java.util.Scanner;

public class Spoilers implements AirParts{
    
    int stock = 8700;
    int deldate = 56;

    public void Available(){
        
        Scanner in = new Scanner(System.in);

        if(stock>0){
            System.out.println("The number of parts available: " +stock);

            System.out.println("Enter the number of parts you wish to order: ");
            int n = in.nextInt();

            System.out.println("The part will be delivered to you in " +deldate +" days.");

            stock = stock-n;
            System.out.println("Number of parts now available: " +stock);
        }

        else{
            System.out.println("No stock available!! Please check again later.");
        }
        
    }
}
