// Class to implement Avionics add-on

public class CustomPlaneDecorator2 extends PlaneDecorator{
    
    public CustomPlaneDecorator2(Planes1 decoratedPlane){
        super(decoratedPlane);
    }

    public void fly(){
        // decoratedPlane.fly();
        setCustomAvionics(decoratedPlane);
    }

    public void setCustomAvionics(Planes1 decoratedPlane){
        System.out.println("New Feature added: Custom Avionics.");
        System.out.println("Added Price: $2,750,000");
    }
}
