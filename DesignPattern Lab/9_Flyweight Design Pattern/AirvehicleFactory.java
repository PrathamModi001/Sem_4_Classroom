import java.util.HashMap;

// Creating a factory to generate an object
public class AirvehicleFactory {
    
    private static final HashMap planeMap = new HashMap();

    public static Airvehicle getCustomPlane(String color){
        CustomPlane customPlane = (CustomPlane)planeMap.get(color);

        if(customPlane == null){
            customPlane = new CustomPlane(color);
            planeMap.put(color, customPlane);
            System.out.println("Creating a plane of color: " +color);
        }

        return customPlane;
    }
}
