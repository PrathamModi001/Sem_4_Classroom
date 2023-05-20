
interface CompPlan {
    
    public void setBrand(String brand);
    public void setProcessor(String processor);
    public void setGraphics(String graphics);
    public void setColor(String color);

}

class Computer implements CompPlan{

    private String brand;
    private String processor;
    private String graphics;
    private String color;

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public void setProcessor(String processor) {
        this.processor = processor; 
    }
    @Override
    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
}

interface ComputerBuilder{

    public void buildBrand();
    public void buildProcessor();
    public void buildGraphics();
    public void buildColor();
    public Computer getComputer();

}

class Computer1 implements ComputerBuilder{

    private Computer computer;

    public Computer1(){
        this.computer = new Computer();
    }

    @Override
    public void buildBrand() {
        computer.setBrand("Hewlett & Packard");
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Evo i7");
    }

    @Override
    public void buildGraphics() {
        computer.setGraphics("Intel Iris");
    }

    @Override
    public void buildColor() {
        computer.setColor("Matte Silver");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

}

class Computer2 implements ComputerBuilder{

    private Computer computer;

    public Computer2(){
        this.computer = new Computer();
    }

    @Override
    public void buildBrand() {
        computer.setBrand("Dell");
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel i5");
    }

    @Override
    public void buildGraphics() {
        computer.setGraphics("NVidia");
    }

    @Override
    public void buildColor() {
        computer.setColor("Black");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

}

class ComputerEngineer{

    private ComputerBuilder computerBuilder;

    public ComputerEngineer(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer(){
        return this.computerBuilder.getComputer();
    }

    public void buyComputer(){

        this.computerBuilder.buildBrand();
        this.computerBuilder.buildProcessor();
        this.computerBuilder.buildGraphics();
        this.computerBuilder.buildColor();

    }
}

class ComputerPlan
{
    public static void main(String[] args)
    {
        ComputerBuilder compBuilder = new Computer1();
        ComputerEngineer engineer = new ComputerEngineer(compBuilder);
  
        engineer.buyComputer();
  
        Computer computer = engineer.getComputer();
  
        System.out.println("Builder constructed: " +computer);
    }
}