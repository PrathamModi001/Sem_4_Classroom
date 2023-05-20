public class DefenseFactory extends AbstractFactory{

    @Override
    Commercial getCommercial(String commercial) {
        return null;
    }

    @Override
    Defense getDefense(String defense) {
        
        if(defense.equals("Lockheed")){
            return new Lockheed();
        }

        else if(defense.equals("Northrop")){
            return new Northrop();
        }

        else{
            return null;
        }
    }
    
    
}
