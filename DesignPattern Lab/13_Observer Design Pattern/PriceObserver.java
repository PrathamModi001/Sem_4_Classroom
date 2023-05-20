public class PriceObserver extends Observer{

    public PriceObserver(Subject subject){
       this.subject = subject;
       this.subject.attach(this);
    }
 
    @Override
    public void update() {

        int state = subject.getState();
       
        if(state == 1){
            System.out.println("The price is: $23,000,000");
        }
        
        else if(state == 2){
            System.out.println("The price is: $25,000,000");
        }
        
    }
    
}