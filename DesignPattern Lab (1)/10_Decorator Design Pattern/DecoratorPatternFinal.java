import java.util.Scanner;

// Simple user interface to take choices from the user and act accordingly

public class DecoratorPatternFinal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("-------- Welcome to The Flying Shop --------");
        System.out.println("");

        System.out.println("2 choices are available: ");
        System.out.println("1.) Defense");
        System.out.println("2.) Commercial");
        System.out.println("Please make your choice: ");
        int choice1 = in.nextInt();
        System.out.println("");
        // Due to this choice, either Defense.java or Commercial.java will be invoked.

        if(choice1 == 1){

            Planes1 defense = new Defense();
            defense.fly();
            System.out.println("");

            System.out.println("We have two add-on features available: ");
            System.out.println("1.) Custom Livery");
            System.out.println("2.) Custom Avionics");
            System.out.println("Enter 3 if you do not wish to add a custom feature.");
            System.out.println("Please enter your choice: ");
            int choice2 = in.nextInt();
            System.out.println("");
            // Due to this, either CustomPlaneDecorator1.java or CustomPlaneDecorator2.java will be invoked, as these are the 2 different files for 2 different add-on features.

            if(choice2 == 1){

                Planes1 customdefense = new CustomPlaneDecorator1(new Defense());
                customdefense.fly();

            }

            else if(choice2 == 2){

                Planes1 customcommercial = new CustomPlaneDecorator2(new Defense());
                customcommercial.fly();

            }

            else if(choice2 == 3){
                System.out.println("Thank you for shopping with us.");
            }

            System.out.println("");
            System.out.println("Thank you for shopping with us.");
            System.out.println("");
            
        }

        else if(choice1 == 2){

            Planes1 commercial = new Commercial();
            commercial.fly();
            System.out.println("");

            System.out.println("We have two add-on features available: ");
            System.out.println("1.) Custom Livery");
            System.out.println("2.) Custom Avionics");
            System.out.println("Enter 3 if you do not wish to add a custom feature.");
            System.out.println("Please enter your choice: ");
            int choice2 = in.nextInt();
            System.out.println("");
            // Due to this, either CustomPlaneDecorator1.java or CustomPlaneDecorator2.java will be invoked, as these are the 2 different files for 2 different add-on features.

            if(choice2 == 1){

                Planes1 customdefense = new CustomPlaneDecorator1(new Commercial());
                customdefense.fly();

            }

            else if(choice2 == 2){

                Planes1 customcommercial = new CustomPlaneDecorator2(new Commercial());
                customcommercial.fly();

            }

            else if(choice2 == 3){
                System.out.println("Thank you for shopping with us.");
            }

            System.out.println("");
            System.out.println("Thank you for shopping with us.");
            System.out.println("");
            
        }


        
    }
}