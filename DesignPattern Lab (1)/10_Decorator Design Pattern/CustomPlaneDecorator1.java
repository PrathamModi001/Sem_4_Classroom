// Class to implement the livery add-on

public class CustomPlaneDecorator1 extends PlaneDecorator{
    
    public CustomPlaneDecorator1(Planes1 decoratedPlane){
        super(decoratedPlane);
    }

    public void fly(){
        // decoratedPlane.fly();
        setCustomLivery(decoratedPlane);
    }

    public void setCustomLivery(Planes1 decoratedPlane){
        System.out.println("New Feature added: Custom Livery.");
        System.out.println("Added price: $400,000");
    }
    
}
