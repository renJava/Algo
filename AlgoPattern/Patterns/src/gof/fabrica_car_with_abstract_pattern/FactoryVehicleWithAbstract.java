package gof.fabrica_car_with_abstract_pattern;

// Общий интерфейс с методом drive()
public interface FactoryVehicleWithAbstract {
    void drive();
}

// Класс Car с уникальной реализацией метода drive()
class Car implements FactoryVehicleWithAbstract {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

// Класс Track с уникальной реализацией метода drive()
class Track implements FactoryVehicleWithAbstract {
    @Override
    public void drive() {
        System.out.println("Driving a track.");
    }
}

// Абстрактный класс VehicleFactory с фабричным методом createVehicle()
abstract class VehicleFactory {
    public abstract FactoryVehicleWithAbstract createVehicle();
}

// Конкретный класс CarFactory, наследующий VehicleFactory и реализующий фабричный метод createVehicle() для создания объекта Car
class CarFactory extends VehicleFactory {
    @Override
    public FactoryVehicleWithAbstract createVehicle() {
        return new Car();
    }
}

// Конкретный класс TruckFactory, наследующий VehicleFactory и реализующий фабричный метод createVehicle() для создания объекта Track
class TruckFactory extends VehicleFactory {
    @Override
    public FactoryVehicleWithAbstract createVehicle() {
        return new Track();
    }
}
