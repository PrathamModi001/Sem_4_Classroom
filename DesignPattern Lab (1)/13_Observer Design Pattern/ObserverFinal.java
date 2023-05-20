import java.util.Scanner;

public class ObserverFinal {
    public static void main(String[] args) {
       Subject subject = new Subject();
 
       new CompanyObserver(subject);
       new YearObserver(subject);
       new PriceObserver(subject);

       Scanner in = new Scanner(System.in);

       System.out.println("2 planes are available: ");
       System.out.println("1.) B747");
       System.out.println("2.) A380");
       System.out.println("Select the airplane whose information you wish to access: ");
       int choice = in.nextInt();

       subject.setState(choice);

       in.close();
    }
 }