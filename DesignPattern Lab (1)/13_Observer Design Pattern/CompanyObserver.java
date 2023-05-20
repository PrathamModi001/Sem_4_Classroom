public class CompanyObserver extends Observer{

    public CompanyObserver(Subject subject){
       this.subject = subject;
       this.subject.attach(this);
    }
 
    @Override
    public void update() {

        int state = subject.getState();
       
        if(state == 1){
            System.out.println("The company is: Boeing");
        }
        
        else if(state == 2){
            System.out.println("The company is: Airbus");
        }
        
    }
    
}