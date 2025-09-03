public class EarlyAndLateBinding {
    // Определяем класс Computer
    public static class Computer {
        // Метод startup() для класса Computer
        public void startup() {
            System.out.print("computer-"); // Выводим "computer-"
        }
    }

    // Определяем класс Laptop, который наследует класс Computer
    static class Laptop extends Computer {
        // Переопределяем метод startup() для класса Laptop
        @Override
        public void startup() {
            System.out.print("laptop-"); // Выводим "laptop-"
        }
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса Computer
        Computer computer = new Computer();
        // Вызываем метод startup() для экземпляра класса Computer
        computer.startup();
        // Создаем экземпляр класса Laptop
        Laptop laptop = new Laptop();
        // Вызываем метод startup() для экземпляра класса Laptop
        laptop.startup();

        Computer computer1 = new Laptop(); // Полиморфизм позднее связывание
        computer1.startup();


    }
}