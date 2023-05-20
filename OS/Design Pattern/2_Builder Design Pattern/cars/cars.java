package cars;

public class cars {
    private String company;
    private int horsePower;
    private float zeroToSixty;
    private String fuelType;
    private int Capacity;

    public cars(String company, int horsePower, float zeroToSixty, String fuelType, int Capacity) {
        super();
        this.company = company;
        this.horsePower = horsePower;
        this.zeroToSixty = zeroToSixty;
        this.fuelType = fuelType;
        this.Capacity = Capacity;
    }

    @Override
    public String toString() {
        return "cars [company=" + company + ", horsePower=" + horsePower + ", zeroToSixty=" + zeroToSixty
                + ", fuelType=" + fuelType + ", Capacity=" + Capacity + "]";
    }

}
