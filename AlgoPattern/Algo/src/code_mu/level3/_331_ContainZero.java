package code_mu.level3;

/**
 * Уровень 3.3 задачника Java
 * № 33.1
 * <p>
 * Дано целое число:
 *
 * int num = 1204;
 * Проверьте, содержит ли это число цифру 0.
 */

public class _331_ContainZero {
    public static void main(String[] args) {
        int num = 1204;
        System.out.println("Число " + num + " содержит цифру 0 ? " + Integer.toString(num).contains("0"));
/*
        int num = 1204;
        System.out.println("Результат: " + String.valueOf(num).contains("0"));
*/
    }
}
