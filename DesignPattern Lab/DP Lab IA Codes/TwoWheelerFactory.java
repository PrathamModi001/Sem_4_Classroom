public class TwoWheelerFactory extends InsuranceAbstractFactory{

    @Override
    TwoWheeler getTwoWheeler(String twoWheeler) {
        // TODO Auto-generated method stub
        
        if(twoWheeler.equals("Headlight")){
            return new Headlight();
        }

        else if(twoWheeler.equals("Tyres")){
            return new Tyres();
        }

        else{
            return null;
        }
    }

    @Override
    FourWheeler getFourWheeler(String fourWheeler) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
