package fundamental;

// Интерфейс, который определяет общий набор операций
interface Printer {
    void print(String message);
}

// Класс, реализующий интерфейс Fundamental.Printer
class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}

// Класс, использующий делегирование для выполнения операций Fundamental.Printer
class PrinterClient {
    private final Printer printer;

    public PrinterClient(Printer printer) {
        this.printer = printer;
    }

    public void doPrint(String message) {
        printer.print(message);
    }
}

// Пример использования
public class DelegationPatternExPrinter {
    public static void main(String[] args) {
        // Создание экземпляра класса, реализующего Fundamental.Printer
        Printer consolePrinter = new ConsolePrinter();

        // Создание экземпляра класса, использующего делегирование
        PrinterClient printerClient = new PrinterClient(consolePrinter);

        // Вызов операции печати через делегирование
        printerClient.doPrint("Hello, World!");
    }
}