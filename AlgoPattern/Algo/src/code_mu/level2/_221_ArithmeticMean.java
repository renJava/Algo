package code_mu.level2;

/**
 * Уровень 2.2 задачника Java
 * № 22.1
 * <p>
 * Найдите среднее арифметическое всех целых чисел от 1 до 100.
 */
public class _221_ArithmeticMean {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Среднее арифметическое от 1 до 100 = " + sum / 100);
    }
}
