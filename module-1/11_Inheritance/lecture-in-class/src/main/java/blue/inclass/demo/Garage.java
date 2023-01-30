package blue.inclass.demo;

public class Garage {

    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck(14, 1000.0, "scary jet black");

        repair((Car)car);
        repair((Truck)truck);

        System.out.println("=============");
        truck.coupleCargoContainer();
         Vehicle vehicle = new Vehicle();
        repair((Vehicle)car);
        repair((Vehicle)truck);
    }

    public static void repair(Car currentCar){
        System.out.println("working on car " + currentCar.toString());
    }

    public static void repair(Truck currentTruck){
        System.out.println("working on truck " + currentTruck.toString());
    }

    public static void repair(Vehicle someVehicle){
        System.out.println("working on " + someVehicle.toString());
    }

}
