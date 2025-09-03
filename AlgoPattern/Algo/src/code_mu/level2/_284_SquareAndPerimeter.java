package code_mu.level2;

/**
 * Уровень 2.8 задачника Java
 * № 28.4
 * <p>
 * Даны переменные, содержащие стороны прямоугольника:
 *
 * int a = 10;
 * int b = 20;
 * Получите площадь и периметр этого прямоугольника.
 */

public class _284_SquareAndPerimeter {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Площадь прямоугольника = " + a * b + ", " +
                "периметр прямоугольника = " + 2 * (a + b));
    }

}
