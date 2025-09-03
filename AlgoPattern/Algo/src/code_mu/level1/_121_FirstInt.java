package code_mu.level1;

/**
 * Уровень 1.2 задачника Java
 * № 121
 * <p>
 * Дано целое число. Выведите в консоль первую цифру этого числа.
 */

public class _121_FirstInt {
    static int firstInt = 56789;

    public static void main(String[] args) {
        System.out.println("Первая цифра целого числа: " + String.valueOf(firstInt).charAt(0));
    }
}
