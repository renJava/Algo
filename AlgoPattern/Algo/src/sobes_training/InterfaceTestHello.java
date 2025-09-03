package sobes_training;

interface I {
    void print(); // Метод для вывода сообщения
}

public class InterfaceTestHello {
    // Метод для создания объекта интерфейса
    public I create() {
        return () -> System.out.println("Hello!"); // Возвращает анонимный класс с реализацией метода print
    }

    private I i = this::create; // Инициализация поля i вызовом метода create()

    // Метод для тестирования вызова метода print
    public void test() {
        i.print(); // Вызов метода print у объекта i
    }

    public static void main(String[] args) {
        InterfaceTestHello test = new InterfaceTestHello(); // Создание экземпляра класса InterfaceTest
        test.test(); // Вызов метода test
    }
}