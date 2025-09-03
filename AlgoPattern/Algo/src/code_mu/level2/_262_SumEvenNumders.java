package code_mu.level2;

/**
 * Уровень 2.6 задачника Java
 * № 26.3
 * <p>
 * <p>
 * Дан массив с целыми числами:
 * <p>
 * int[] arr = {1, 2, 3, 4, 5};
 * Выведите в консоль элементы этого массива, которые являются четными числами.
 */

public class _262_SumEvenNumders {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Только чётные числа из массива: ");
        for (int j : arr) {
            System.out.print(j % 2 == 0 ? j + " " : "");

        }
    }
}
