import java.util.Scanner;

public class InsuranceFinal {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("---- M.N.P. Insurance Pvt. Ltd. ----");
        System.out.println(" ");
        System.out.println("The 2 types of vehicles available are: ");
        System.out.println("1). Two wheelers");
        System.out.println("2). Four wheelers");
        System.out.println(" ");
        System.out.println("Please make your choice by entering the corresponding number: ");
        int select = in.nextInt();

        if(select == 1){

            InsuranceAbstractFactory twowheelerFactory = InsuranceFactoryProducer.getFactory("TwoWheeler");

            System.out.println("For two wheelers, we have 2 parts covered: Headlights & Tyres");
            System.out.println("Please select: ");
            String sel = in.nextLine();

            TwoWheeler two1 = twowheelerFactory.getTwoWheeler(sel);
            two1.TwoWheeler();
        }

        else if(select == 2){

            InsuranceAbstractFactory fourwheelerFactory = InsuranceFactoryProducer.getFactory("FourWheeler");

            System.out.println("For four wheelers, we have 2 parts covered: Windshield & Bumpers");
            System.out.println("Please select: ");
            String sel = in.nextLine();

            FourWheeler four1 = fourwheelerFactory.getFourWheeler(sel);
            four1.FourWheeler();

        }

        else{
            System.out.println("!!!! Please re-execute the program and make a valid choice !!!!");
        }

    }

}
