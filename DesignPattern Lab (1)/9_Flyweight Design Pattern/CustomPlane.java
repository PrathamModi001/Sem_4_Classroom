public class CustomPlane implements Airvehicle{
    
    // Initializing the attributes of a customized object
    private String color;
    private int range;
    private int capacity;
    private int cost;

    // Implementing the attributes
    public CustomPlane(String color){
        this.color = color;
    }

    public void setRange(int range){
        this.range = range;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    // Attaching the attributes to the customized object
    public void create(){
        System.out.println("Plane has been created:");
        System.out.println("Color: " +color);
        System.out.println("Range: " +range);
        System.out.println("Capacity: " +capacity);
        System.out.println("Cost: " +cost);
    }
}
