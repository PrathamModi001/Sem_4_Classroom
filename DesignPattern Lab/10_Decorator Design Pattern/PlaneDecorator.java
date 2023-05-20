// Class to implement the main interface

public abstract class PlaneDecorator implements Planes1{

    protected Planes1 decoratedPlane;

    public PlaneDecorator(Planes1 decoratedPlane){
        this.decoratedPlane = decoratedPlane;
    }

    public void fly(){
        decoratedPlane.fly();
    }
    
}
