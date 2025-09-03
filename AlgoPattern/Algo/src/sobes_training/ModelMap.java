package sobes_training;
/**
 * Написать метод toBrandMap, который возвращает карту, где в качестве ключей используются бренды машин,
 * а в значении - модели
 */

import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Arrays;

// Класс, представляющий автомобиль
@Getter
class Car {
    // Метод для получения марки
    private final String brand;  // Марка автомобиля
    // Метод для получения модели
    private final String model;  // Модель автомобиля

    // Конструктор для создания нового объекта Car
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

}

// Класс, содержащий метод для группировки автомобилей по брендам
class BrandModelMap {
    // Метод, который принимает список автомобилей и возвращает карту брендов и моделей
    Map<String, List<String>> toBrandMap(List<Car> cars) {
        // Создаем карту для хранения брендов и списков моделей
        Map<String, List<String>> brandModelMap = new HashMap<>();

        // Перебираем все автомобили в списке
        for (Car car : cars) {
            // Получаем бренд и модель текущего автомобиля
            String brand = car.getBrand();
            String model = car.getModel();

            // Если бренд еще не существует в карте, добавляем его с пустым списком
            brandModelMap.putIfAbsent(brand, new ArrayList<>());

            // Добавляем модель в список для данного бренда
            brandModelMap.get(brand).add(model);
        }

        // Возвращаем заполненную карту
        return brandModelMap;
    }
}

// Основной класс для запуска программы
public class ModelMap {
    public static void main(String[] args) {
        // Создаем список автомобилей
        List<Car> cars = Arrays.asList(
                new Car("Toyota", "Camry"),   // Toyota Camry
                new Car("Toyota", "Corolla"),  // Toyota Corolla
                new Car("Honda", "Civic"),     // Honda Civic
                new Car("Ford", "Mustang")     // Ford Mustang
        );

        // Создаем объект BrandModelMap
        BrandModelMap brandModelMap = new BrandModelMap();

        // Получаем карту брендов и моделей
        Map<String, List<String>> result = brandModelMap.toBrandMap(cars);

        // Выводим результат на экран
        System.out.println(result);
    }
}