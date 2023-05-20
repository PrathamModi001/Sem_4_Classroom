// Creating objects for the basic interface

public class PlaneFlyer implements PlaneMaker{

    PlaneAdapter planeAdapter;

    @Override
    public void Fly(String planeType, String name) {
        // TODO Auto-generated method stub

        // In Built support to build a normal plane
        if(planeType.equals("Normal")){
            System.out.println("A normal plane is being manufactured. Name: " +name);
        }

        // Support for other types
        // Here, the advanced interface is connected with the basic interface
        else if(planeType.equals("Luxury") || planeType.equals("Range")){
            planeAdapter = new PlaneAdapter(planeType);
            planeAdapter.Fly(planeType, name);
        }

        else{
            System.out.println("Invalid choice. " +planeType +" type not supported.");
        }
        
    }
    
}
