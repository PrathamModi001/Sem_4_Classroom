import java.util.Scanner;

// Main method to implement planes with their customization
public class AdapterPatternDemo {
    public static void main(String[] args) {

        PlaneFlyer planeFlyer = new PlaneFlyer();
        
        planeFlyer.Fly("Normal", "Cessna");
        planeFlyer.Fly("Luxury", "Embraer");
        planeFlyer.Fly("Range", "Boeing");
        planeFlyer.Fly("High-End", "Airbus");
        
    }
}
