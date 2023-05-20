public class GroundState implements State {
    
    @Override
    public void doAction(Context context) {
        // TODO Auto-generated method stub
        System.out.println("The plane is in the grounded state");
        context.setState(this);
    } 
    
    public String toString(){
        return "Grounded State";
    }

}
