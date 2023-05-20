import java.util.Scanner;

public class AbstractFinal {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("---- M.N.P. Aviation Pvt. Ltd. ----");
        System.out.println(" ");
        System.out.println("The 2 sectors available are: ");
        System.out.println("1). Commercial");
        System.out.println("2). Defense");
        System.out.println(" ");
        System.out.println("Please make your choice by entering the corresponding number: ");
        int select = in.nextInt();

        if(select == 1){

            AbstractFactory commercialFactory = FactoryProducer.getFactory("Commercial");

            System.out.println("In the Commercial Sector, we have 2 options available: Boeing & Airbus");
            System.out.println("Please select: ");
            String sel = in.nextLine();

            Commercial comm1 = commercialFactory.getCommercial(sel);
            comm1.Commercial();
        }

        else if(select == 2){

            AbstractFactory defenseFactory = FactoryProducer.getFactory("Defense");

            System.out.println("In the Defense Sector, we have 2 options available: Lockheed & Northrop");
            System.out.println("Please select: ");
            String sel = in.nextLine();

            Defense def1 = defenseFactory.getDefense(sel);
            def1.Defense();

        }

        else{
            System.out.println("!!!! Please re-execute the program and make a valid choice !!!!");
        }

    }

}
