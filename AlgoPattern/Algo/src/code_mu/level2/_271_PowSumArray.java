package code_mu.level2;

/**
 * Уровень 2.7 задачника Java
 * № 27.1
 * <p>
 *
 * Дан массив с целыми числами:
 *
 * int[] arr = {1, 2, 3, 4, 5};
 * Найдите сумму квадратов элементов этого массива.
 */

public class _271_PowSumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        System.out.print("\nСумма квадратов элементов массива: ");
        for (int j : arr) {
            sum += j * j;
        }
        System.out.println(sum);

    }
}
