package blue.inclass.demo;

public class Vehicle {

    private int numberOfWheels;
    protected double engineSize;
    private String bodyColor;

    public Vehicle(){
//        this.bodyColor = "clear";
//        this.engineSize = 150.0;
//        this.numberOfWheels = 4;
        this(4, 150.0, "neon clear");
    }

    public Vehicle(int numberOfWheels, double engineSize, String bodyColor){
        this.numberOfWheels = numberOfWheels;
        this.engineSize = engineSize;
        this.bodyColor = bodyColor;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public double getEngineSize() {
        return this.engineSize;
    }

    public String getBodyColor() {
        return this.bodyColor;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfWheels=" + numberOfWheels +
                ", engineSize=" + engineSize +
                ", bodyColor='" + bodyColor + '\'' +
                '}';
    }
}
