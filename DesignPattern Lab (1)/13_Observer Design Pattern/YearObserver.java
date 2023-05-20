public class YearObserver extends Observer{

    public YearObserver(Subject subject){
       this.subject = subject;
       this.subject.attach(this);
    }
 
    @Override
    public void update() {

        int state = subject.getState();
       
        if(state == 1){
            System.out.println("The manufacturing year is: 1968");
        }
        
        else if(state == 2){
            System.out.println("The manufacturing year is: 1973");
        }
        
    }
    
}