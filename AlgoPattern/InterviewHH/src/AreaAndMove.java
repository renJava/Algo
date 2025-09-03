/**
 * 1. Создать квадрат с центром в точке (2; 3) и стороной 4
 * 2. Создать прямоугольник с центром в точке (-1; -3) и сторонами 2 и 3
 * 3. Создать окружность с центром и радиусом, переданными аргументами командной строки
 * 4. Вычислить площади всех созданных фигур
 * 5. Подвинуть квадрат влево на 2 и вверх на 1
 */
abstract class Shape {
    protected double centerX;
    protected double centerY;

    public Shape(double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public abstract double getArea();

    public void move(double dx, double dy) {
        centerX += dx;
        centerY += dy;
    }

    @Override
    public String toString() {
        return String.format("Shape: center=(%.1f, %.1f)", centerX, centerY);
    }
}

class Square extends Shape {
    private final double side;

    public Square(double centerX, double centerY, double side) {
        super(centerX, centerY);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("Square: center=(%.1f, %.1f), side=%.1f", centerX, centerY, side);
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double centerX, double centerY, double width, double height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle: center=(%.1f, %.1f), width=%.1f, height=%.1f", centerX, centerY, width, height);
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double centerX, double centerY, double radius) {
        super(centerX, centerY);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: center=(%.1f, %.1f), radius=%.1f", centerX, centerY, radius);
    }
}

public class AreaAndMove {
    public static void main(String[] args) {
        Square square = new Square(2, 3, 4);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(-1, -3, 2, 3);
        System.out.println(rectangle);

        // Создать окружность с центром и радиусом, переданными аргументами командной строки
        Circle circle = null;        // Init circle
        if (args.length == 3) {  // Проверка, передано ли достаточное количество аргументов (3)
            // args[0] - centerX, args[1] - centerY, args[2] - radius
            // parseDouble - преобразование строки в double
            circle = new Circle(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
            System.out.println(circle);
        } else {
            System.out.println("Not enough arguments to create a circle.");
        }

        System.out.println("Area Square: " + square.getArea());
        System.out.println("Area Rectangle: " + rectangle.getArea());
        if (circle != null) {
            System.out.println("Area Circle: " + circle.getArea());
        }

        square.move(-2, 1);
        System.out.println("Square after moving: " + square);
    }
}