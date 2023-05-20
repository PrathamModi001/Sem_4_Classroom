// Class which implements the basic interface

public class PlaneAdapter implements PlaneMaker{

    AdvancedPlaneMaker advancedFlyer;


    // Defining a method to act upon the user input
    public PlaneAdapter(String planeType){

        if(planeType.equals("Luxury")){
            advancedFlyer = new LuxuryPlane();
        }

        else if(planeType.equals("Range")){
            advancedFlyer = new RangedPlane();
        }
    }

    // Overriding the basic interface method to cope with the customizations
    @Override
    public void Fly(String planeType, String name) {
        // TODO Auto-generated method stub
        
        if(planeType.equals("Luxury")){
            advancedFlyer.Luxury(name);
        }

        else if(planeType.equals("Range")){
            advancedFlyer.Range(name);
        }
    }
    
}
