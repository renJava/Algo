package code_mu.level2;

/**
 * Уровень 2.10 задачника Java
 * № 210.2
 * <p>
 * Даны два целых числа:
 *
 * int num1 = 12;
 * int num2 = 16;
 * Выведите в консоль все общие делители этих чисел.
 */

public class _2102_CommonsDivisor {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 16;

        int min = num1 <= num2 ? num1 : num2;

        System.out.println("Общие делители представленных чисел: ");
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
