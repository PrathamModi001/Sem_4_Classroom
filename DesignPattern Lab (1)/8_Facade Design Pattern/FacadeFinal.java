// Simple user interface code which asks the user for their choice

import java.util.Scanner;

public class FacadeFinal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("The options are: ");
        System.out.println("1.) Defense");
        System.out.println("2.) Commercial");
        System.out.println("3.) Chartered");
        System.out.println("Please make a selection: ");
        int choice = in.nextInt();
        
        Plane_maker plane_maker = new Plane_maker();

        if(choice==1){
            plane_maker.flyDefenses();
            System.out.println("The other choices would have yielded: ");
            plane_maker.flyCommercials();
            plane_maker.flyChartered();
        }

        else if(choice==2){
            plane_maker.flyCommercials();
            System.out.println("The other choices would have yielded: ");
            plane_maker.flyDefenses();
            plane_maker.flyChartered();
        }

        else if(choice==3){
            plane_maker.flyChartered();
            System.out.println("The other choices would have yielded: ");
            plane_maker.flyDefenses();
            plane_maker.flyCommercials();
        }

        else{
            System.out.println("Please make a valid choice.");
        }

        in.close();

        // plane_maker.flyDefenses();
        // plane_maker.flyCommercials();
        // plane_maker.flyChartered();
        
    }
}
