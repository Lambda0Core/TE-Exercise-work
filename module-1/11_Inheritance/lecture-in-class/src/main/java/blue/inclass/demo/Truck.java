package blue.inclass.demo;

public class Truck extends Vehicle {


    public Truck(int numberOfWheels, double engineSize, String bodycolor ){
        super(numberOfWheels, engineSize,bodycolor);
    }

    public void report(){
        System.out.println("=======  print truck ===========");
        super.setNumberOfWheels(10);
        System.out.println(this.toString());
    }

    public void coupleCargoContainer(){
        System.out.println("coupling cargo container");
        super.setNumberOfWheels(18);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numberOfWheels=" + getNumberOfWheels() +
                ", engineSize=" + getEngineSize() +
                ", bodyColor='" + getBodyColor() + '\'' +
                '}';
    }
}
