package blue.inclass.demo;

public class Car extends Vehicle{

    public void report(){
        System.out.println(super.getNumberOfWheels());
        super.setNumberOfWheels(4);
        System.out.println(super.getNumberOfWheels());

        System.out.println(super.engineSize);
    }

    public void report(boolean carOnly){
        System.out.println("============  car only ============");
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + getNumberOfWheels() +
                ", engineSize=" + getEngineSize() +
                ", bodyColor='" + getBodyColor() + '\'' +
                '}';
  }
}
