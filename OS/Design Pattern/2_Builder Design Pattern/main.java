import cars.*;

public class main {
    public static void main(String[] args) {
        cars c = new carBuilder().setCompany("Tesla").setZeroToSixty(5.89f).getCars();
        System.out.println(c);
    }
}
