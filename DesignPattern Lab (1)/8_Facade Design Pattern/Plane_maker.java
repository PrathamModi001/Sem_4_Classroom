// Funvtion to chose from the 3 objects created

public class Plane_maker {
    
    // Initializing objects
    private Defenses defenses;
    private Aircrafts commercials;
    private Aircrafts chartered;

    // Assigning the functions to the objects created
    public Plane_maker(){
        defenses = new Defenses();
        commercials = new Commercials();
        chartered = new Chartered();
    }

    // Simply calling the functions

    public void flyDefenses(){
        defenses.fly();
    }

    public void flyCommercials(){
        commercials.fly();
    }

    public void flyChartered(){
        chartered.fly();
    }
}
