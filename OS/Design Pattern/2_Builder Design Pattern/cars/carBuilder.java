package cars;

public class carBuilder {
    private String company = "Mercedes";
    private int horsePower = 600;
    private float zeroToSixty = 7.7f;
    private String fuelType = "Diesel";
    private int Capacity = 4;

    public carBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public carBuilder setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public carBuilder setZeroToSixty(float zeroToSixty) {
        this.zeroToSixty = zeroToSixty;
        return this;
    }

    public carBuilder setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public carBuilder setCapacity(int Capacity) {
        this.Capacity = Capacity;
        return this;
    }

    public cars getCars() {
        return new cars(company, horsePower, zeroToSixty, fuelType, Capacity);
    }
}