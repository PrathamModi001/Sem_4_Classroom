
public class PartsFactory {

    AirParts getAirParts(String partType) {

        if (partType.equals("Rudders")) {
            return new Rudders();
        }

        else if (partType.equals("Spoilers")) {
            return new Spoilers();
        }

        else if (partType.equals("Flaps")) {
            return new Flaps();
        }

        else {
            return null;
        }

    }
}
