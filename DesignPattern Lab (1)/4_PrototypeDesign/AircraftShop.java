

import java.util.ArrayList;
import java.util.List;

public class AircraftShop{
    
    private String aircraftShop;
    List<Aircraft> Aircrafts = new ArrayList<>();

    public String getAircraftShop(){
        return aircraftShop;
    }

    public void setAircraftShop(String aircraftShop){
        this.aircraftShop = aircraftShop;
    }

    public List<Aircraft> getAircrafts(){
        return Aircrafts;
    }

    public void setAircrafts(List<Aircraft> Aircrafts){
        this.Aircrafts = Aircrafts;
    }

    public void LoadData(){
        for(int i=1; i<10; i++){
            Aircraft a = new Aircraft();
            a.setCost(i);
            a.setName("Aircrafts " +i);
            getAircrafts().add(a);
        }
    }

    public String toString(){
        return "AircraftShop [aircraftShop = " + aircraftShop +", Aircrafts = " +Aircrafts + "]";
    }

    protected AircraftShop clone() throws CloneNotSupportedException{
        AircraftShop shop = new AircraftShop();

        for(Aircraft a: this.getAircrafts()){
            shop.getAircrafts().add(a);
        }

        return shop;
    }
}
