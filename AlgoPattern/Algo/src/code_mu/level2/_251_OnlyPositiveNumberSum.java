package code_mu.level2;

/**
 * Уровень 2.5 задачника Java
 * № 25.1
 * <p>
 * Дан массив с целыми числами:
 * <p>
 * int[] arr = {1, 2, 3, 4, 5};
 * Найдите сумму квадратов элементов этого массива.
 */

public class _251_OnlyPositiveNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("\nСумма квадратов элементов массива: ");
        for (int i : new int[]{1, 2, 3, 4, 5}) {
            sum += i * i;
        }
        System.out.print(sum);
    }

}
