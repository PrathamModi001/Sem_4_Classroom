

public class PrototypeDemo{
    public static void main(String[] args) throws CloneNotSupportedException{
        
        AircraftShop as1 = new AircraftShop();
        as1.setAircraftShop("Shop1");
        as1.LoadData();

        // AircraftShop as2 = new AircraftShop();
        // as2.setAircraftShop("Shop1");
        // as2.LoadData();
        // System.out.println(as2);
        
        AircraftShop as2 = (AircraftShop) as1.clone();
        as1.getAircrafts().remove(2);
        as2.setAircraftShop("Shop2");
        
        System.out.println(as1);
        System.out.println(as2);
    }
}
