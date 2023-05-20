public class MementoFinal {
    public static void main(String[] args) {
    
       Originator originator = new Originator();
       CareTaker careTaker = new CareTaker();
       
       originator.setState("Grounded");
       originator.setState("Flying");
       careTaker.add(originator.saveStateToMemento());
       
       originator.setState("Maintenance");
       careTaker.add(originator.saveStateToMemento());
       
       originator.setState("Flying");
       System.out.println("Current State: " + originator.getState());		
       
       originator.getStateFromMemento(careTaker.get(0));
       System.out.println("First saved State: " + originator.getState());
       originator.getStateFromMemento(careTaker.get(1));
       System.out.println("Second saved State: " + originator.getState());

    }
}
