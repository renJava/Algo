package code_mu.level2;

/**
 * Уровень 2.10 задачника Java
 * № 210.1
 * <p>
 * Дана переменная, содержащая радиус шара:
 * <p>
 * float r = 10.3;
 * Получите объем и площадь поверхности этого шара.
 */

public class _2101_BallVolumeAndSquare {
    public static void main(String[] args) {
        float r = 10.3f;
        System.out.println("Объем шара: " + (4 / 3 * Math.PI * r * r * r));
        System.out.println("Площадь поверхности шара: " + (4 * Math.PI * r * r));
    }
}
