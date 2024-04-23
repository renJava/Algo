package gof.fabrica_car_with_abstract_pattern;

class MainFactoryCarAbstract {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        FactoryVehicleWithAbstract car = carFactory.createVehicle();
        car.drive();

        TruckFactory truckFactory = new TruckFactory();
        FactoryVehicleWithAbstract truck = truckFactory.createVehicle();
        truck.drive();
    }
}
