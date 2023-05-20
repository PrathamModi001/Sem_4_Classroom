
import java.util.Scanner;

public class AIrFinal {

    public static void main(String[] args) {

        PartsFactory part = new PartsFactory();

        Scanner in = new Scanner(System.in);

        System.out.println("The available parts are: Rudders, Spoilers and Flaps.");
        System.out.println("Please enter the type of part you are looking for: ");

        String parts = in.nextLine();

        AirParts ap1 = part.getAirParts(parts);
        ap1.Available();
    }
}
