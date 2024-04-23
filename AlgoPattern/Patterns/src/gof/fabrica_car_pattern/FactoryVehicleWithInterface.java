package gof.fabrica_car_pattern;

// Общий интерфейс с методом drive()
public interface FactoryVehicleWithInterface {
    void drive();
}

// Класс Car с уникальной реализацией метода drive()
class Car implements FactoryVehicleWithInterface {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

// Класс Track с уникальной реализацией метода drive()
class Track implements FactoryVehicleWithInterface {
    @Override
    public void drive() {
        System.out.println("Driving a track.");
    }
}

// Общий интерфейс с фабричным методом
interface VehicleFactory {
    FactoryVehicleWithInterface createVehicle();
}

// Фабричный класс CarFactory с уникальной реализацией метода createVehicle() для создания нового объекта Car
class CarFactory implements VehicleFactory {
    @Override
    public FactoryVehicleWithInterface createVehicle() {
        return new Car();
    }
}

// Фабричный класс TruckFactory с уникальной реализацией метода createVehicle() для создания нового объекта Track
class TruckFactory implements VehicleFactory {
    @Override
    public FactoryVehicleWithInterface createVehicle() {
        return new Track();
    }
}
