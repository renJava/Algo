package code_mu.level2;

/**
 * Уровень 2.3 задачника Java
 * № 23.1
 * <p>
 * Дан массив с целыми числами:
 *
 * int[] arr = {1, 2, 3, 4, 5};
 * Найдите сумму квадратов элементов этого массива.
 */

public class _231_SumPow2ArrayEl {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i];
        }
        System.out.println("\nСумма квадратов элементов массива: " + sum);
    }
}
