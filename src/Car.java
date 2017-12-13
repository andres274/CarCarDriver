public class Car {
    private String color;
    private String make;
    private int horsePower;
    private double engineSize;
    public Car(){
        color = "Blue";
        horsePower = 450;
        engineSize= 3.2;
        make = "Honda";
    }
    public Car(String color, int horsePower, double EngineSize, String make){
        this.color = color;
        this.make = make;
        this.engineSize = engineSize;
        this.horsePower = horsePower;

    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }
    public double getEngineSize(){
        return engineSize;
    }
    public void setEngineSize(double engineSize){
        this.engineSize = engineSize;
    }
    @Override
    public String toString() {
        return "Color: " + color + " Make: " + make + " HorsePower: " + horsePower;
    }
}