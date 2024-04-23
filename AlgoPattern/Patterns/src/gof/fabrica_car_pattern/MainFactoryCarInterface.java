package gof.fabrica_car_pattern;

public class MainFactoryCarInterface {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        FactoryVehicleWithInterface car = carFactory.createVehicle();
        car.drive();

        VehicleFactory truckFactory = new TruckFactory();
        FactoryVehicleWithInterface truck = truckFactory.createVehicle();
        truck.drive();
    }
}
