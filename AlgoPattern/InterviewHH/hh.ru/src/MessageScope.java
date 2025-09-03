class Printer {
    public static void print(String message) {
        System.out.println(message);
    }
}
public class MessageScope {
    private static void main (String name, int age) { // memod 1
        String message;
        if (age >= 18) {
            message = name + " is adult";
        } else {
            message = name + "is not adult";
        }
        Printer printer = null;
        printer.print(message);
    }
    public static void main(String[] args) { // метод 2
        main ("Alex", 18);
    }
}