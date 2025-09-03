package code_mu.level2;

/**
 * Уровень 2.1 задачника Java
 * № 21.3
 * <p>
 * Дано некоторое целое число:
 * <p>
 * int num = 12345;
 * Найдите сумму всех его четных цифр.
 */
public class _213_EvenSum {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }
        System.out.println("\nСумма чётных цифр в числе: " + sum);
    }

}
