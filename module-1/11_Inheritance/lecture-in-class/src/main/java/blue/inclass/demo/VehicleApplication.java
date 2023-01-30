package blue.inclass.demo;

public class VehicleApplication {

    public static void main(String[] args) {
        Car car = new Car();
        car.report();

        Vehicle vehicle = new Vehicle();
        vehicle.setNumberOfWheels(18);
        System.out.println(vehicle.toString());
        System.out.println(car.toString());

        car.report(true);

        Truck truck = new Truck(8,500,"fire engine red");

        truck.report();

    }
}
