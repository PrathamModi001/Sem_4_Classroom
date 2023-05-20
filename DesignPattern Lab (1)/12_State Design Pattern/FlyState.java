public class FlyState implements State{

    @Override
    public void doAction(Context context) {
        // TODO Auto-generated method stub
        System.out.println("The plane is in the flying state");
        context.setState(this);
    } 
    
    public String toString(){
        return "Flying State";
    }

}
