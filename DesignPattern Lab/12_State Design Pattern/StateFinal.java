import java.util.Scanner;

public class StateFinal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Which state would you like the plane to be in initially?");
        System.out.println("1.) Flying");
        System.out.println("2.) Grounded");
        System.out.println("Enter your choice: ");
        int choice = in.nextInt();
        
        if(choice == 1){

            Context context = new Context();

            FlyState flyState = new FlyState();
            flyState.doAction(context);
            
            System.out.println(context.getState().toString());

            GroundState groundState = new GroundState();
            groundState.doAction(context);

            System.out.println(context.getState().toString());

        }

        else if(choice == 2){

            Context context = new Context();

            GroundState groundState = new GroundState();
            groundState.doAction(context);

            System.out.println(context.getState().toString());

            FlyState flyState = new FlyState();
            flyState.doAction(context);
            
            System.out.println(context.getState().toString());

        }

        else{
            System.out.println("!! Enter a valid selection !!");
        }
    }
}
