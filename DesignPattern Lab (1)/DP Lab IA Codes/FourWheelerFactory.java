public class FourWheelerFactory extends InsuranceAbstractFactory{

    @Override
    TwoWheeler getTwoWheeler(String twoWheeler) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    FourWheeler getFourWheeler(String fourWheeler) {
        // TODO Auto-generated method stub
        
        if(fourWheeler.equals("Windshield")){
            return new Windshield();
        }

        else if(fourWheeler.equals("Bumpers")){
            return new Bumpers();
        }

        else{
            return null;
        }

    }
    
}
