public class InsuranceFactoryProducer {
    
    public static InsuranceAbstractFactory getFactory(String choice){

        if(choice.equals("TwoWheeler")){
            return new TwoWheelerFactory();
        }

        else if(choice.equals("FourWheeler")){
            return new FourWheelerFactory();
        }

        else{
            return null;
        }
    }
}
