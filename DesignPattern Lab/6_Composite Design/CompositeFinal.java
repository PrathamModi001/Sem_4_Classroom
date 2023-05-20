import javax.sound.midi.Soundbank;

// Main class and method to simply print the results

public class CompositeFinal {
    public static void main(String[] args) {
        
        Aircraft MainCompany = new Aircraft("World Aviation", "Industry", 1913);

        Aircraft Boeing = new Aircraft("Boeing", "Commercial", 1950);
        Aircraft Lockheed = new Aircraft("Lockheed", "Military", 1970);

        Aircraft B747 = new Aircraft("B747", "Commercial", 1965);
        Aircraft B777 = new Aircraft("B777", "Commercial", 1966);

        Aircraft F22 = new Aircraft("F22", "Military", 1990);
        Aircraft F35 = new Aircraft("F35", "Military", 2004);

        MainCompany.add(Boeing);
        MainCompany.add(Lockheed);

        Boeing.add(B747);
        Boeing.add(B777);

        Lockheed.add(F22);
        Lockheed.add(F35);

        System.out.println(MainCompany);

        for(Aircraft headAircraft : MainCompany.getSubordinates()){
            System.out.println(headAircraft);

            for(Aircraft aircraft: headAircraft.getSubordinates()){
                System.out.println(aircraft);
            }
            
        }

    }
}
