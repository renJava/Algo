package code_mu.level2;

/**
 * Уровень 2.3 задачника Java
 * № 23.2
 * <p>
 * Дан массив с целыми числами:
 *
 * int[] arr = {1, 2, 3, 4, 5};
 * Найдите среднее арифметическое этого массива.
 */

public class _232_ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i : arr) {
            sum += arr[i];
        }

        System.out.println("Среднее арифметическое массива: " + sum / arr.length);
/*
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
*/
    }
}
