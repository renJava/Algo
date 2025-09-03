package code_mu.level2;

/**
 * Уровень 2.6 задачника Java
 * № 26.1
 * <p>
 * <p>
 * Дан массив с числами:
 * <p>
 * int[] arr = {-1, 2, -3, 4, 5, 11};
 * Найдите сумму тех элементов этого массива, которые больше нуля и меньше десяти.
 */

public class _261_CondSumArray {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 11};
        int sum = 0;
        for (int i : arr) {
            sum += (i > 0 && i < 10) ? i : 0;
        }
        System.out.println("\nСумма всех элементов массива в диапазоне от 1 до 10: " + sum);
    }

}
