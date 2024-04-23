package gof;

// Базовый интерфейс для фабрики
interface AnimalFactory {
    Animal createAnimal();
}

// Конкретная реализация фабрики для создания собак
class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

// Конкретная реализация фабрики для создания кошек
class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

// Базовый класс для животных
abstract class Animal {
    public abstract void makeSound();
}

// Конкретная реализация класса собаки
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}

// Конкретная реализация класса кошки
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }
}

// Пример использования паттерна фабрика
class FabricaAnimals {
    public static void main(String[] args) {
        // Создаем фабрику для собак
        AnimalFactory dogFactory = new DogFactory();

        // Используем фабрику для создания объекта собаки
        Animal dog = dogFactory.createAnimal();
        dog.makeSound(); // Выводит "Гав-гав!"

        // Создаем фабрику для кошек
        AnimalFactory catFactory = new CatFactory();

        // Используем фабрику для создания объекта кошки
        Animal cat = catFactory.createAnimal();
        cat.makeSound(); // Выводит "Мяу-мяу!"
    }
}
