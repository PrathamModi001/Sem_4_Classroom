public class FlyweightFinal {

    // Creating an array of colors to be applied
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};
    public static void main(String[] args) {
        
        // Iterating the for loop
        for(int i=0; i<5; ++i){
            CustomPlane customPlane = (CustomPlane)AirvehicleFactory.getCustomPlane(getRandomColor());
            customPlane.setRange(getRandomRange());
            customPlane.setCapacity(getRandomCapacity());
            customPlane.setCost(100);
            customPlane.create();
        }

        
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomRange(){
        return (int)(Math.random()*100);
    }

    private static int getRandomCapacity(){
        return (int)(Math.random()*100);
    }
}
