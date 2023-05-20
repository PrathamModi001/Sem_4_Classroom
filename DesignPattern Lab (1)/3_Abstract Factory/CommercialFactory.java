public class CommercialFactory extends AbstractFactory{

    @Override
    Commercial getCommercial(String commercial) {
        
        if(commercial.equals("Boeing")){
            return new Boeing();
        }

        else if(commercial.equals("Airbus")){
            return new Airbus();
        }

        else{
            return null;
        }
    }

    @Override
    Defense getDefense(String defense) {
        return null;
    }

    // public void Commercial() {
    // }
    
    
}
