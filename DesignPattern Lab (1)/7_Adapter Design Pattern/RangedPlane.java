// Creating customization options for the advanced interface

public class RangedPlane implements AdvancedPlaneMaker{
    
    public void Luxury(String name){
        // Do nothing.
    }

    @Override
    public void Range(String name) {
        System.out.println("Plane with a high range is being manufactured. Name: " +name);
    }
}
