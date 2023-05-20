import java.util.ArrayList;
import java.util.List;

// Class which defines the different aircrafts available and their attributes
public class Aircraft {    
    
    private String name;
    private String level;
    private int EstablishedYear;
    private List<Aircraft> subordinates;

    public Aircraft(String name, String level, int EstablishedYear){
        this.name = name;
        this.level = level;
        this.EstablishedYear = EstablishedYear;
        subordinates = new ArrayList<Aircraft>();
    }

    public void add(Aircraft a){
        subordinates.add(a);
    }

    public void remove(Aircraft a){
        subordinates.remove(a);
    }

    public List<Aircraft> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Aircraft: [Name: " +name +", level: " +level +", Established Year: " +EstablishedYear +"]");
    }
}
