package code_mu.level1;

/**
 * Уровень 16 задачника Java
 * № 161
 * <p>
 * Найдите сумму всех целых чисел от 1 до 100.
 */

public class _161_1_100_Sum {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до 100 = " + sum);
    }
}
