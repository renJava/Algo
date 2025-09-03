package code_mu.level2;

/**
 * Уровень 2.2 задачника Java
 * № 22.2
 * <p>
 * Дано число:
 * <p>
 * int num = 12345;
 * Найдите сумму первой и последней цифры этого числа.
 */
public class _222_SumFirstAndEnd {
    public static void main (String[] args) {
        int num = 12345;
        int sum = num % 10 + num / 10000;
        System.out.println("Сумма первой и последней цифры числа 12345 = " + sum);
    }
}
