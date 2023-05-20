public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choice){

        if(choice.equals("Commercial")){
            return new CommercialFactory();
        }

        else if(choice.equals("Defense")){
            return new DefenseFactory();
        }

        else{
            return null;
        }
    }
}
