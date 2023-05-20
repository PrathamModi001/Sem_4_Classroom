import java.util.Scanner;

public class AviationDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("                          ------ Welcome to M.N.P. Aviation Solutions Pvt. Ltd. ------");
        System.out.println(" ");

        System.out.println("Please enter your Username: ");
        String un = in.nextLine();
        System.out.println(" ");

        System.out.println("Please enter your Pin: ");
        int pw = in.nextInt();
        System.out.println(" ");

        System.out.println("We have 2 retailers available:");
        System.out.println("1). Airbus");
        System.out.println("2). Boeing");
        System.out.println("Please enter your choice and you will be directed to the retailer's official website: ");
        int re = in.nextInt();
        System.out.println(" ");

        if (re == 1) {
            AviationObject ao1 = AviationObject.getInstance();
            ao1.Market1(re, un, pw);
        }

        else if (re == 2) {
            AviationObject ao1 = AviationObject.getInstance();
            ao1.Market2(re, un, pw);
        }

        else {
            System.out.println("!! Please make a valid choice !!");
        }

    }
}