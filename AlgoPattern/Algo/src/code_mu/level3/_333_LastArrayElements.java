package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.3 задачника Java
 * № 33.3
 * <p>
 * Дан массив:
 *
 * int[] {1, 2, 3, 4, 5, 6}
 * Получите из него два последних элемента:
 *
 * int[] {5, 6}
 */

public class _333_LastArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arrR = new int[2];

        System.arraycopy(arr, arr.length - 2, arrR, 0, 2);
        System.out.println(Arrays.toString(arrR));

/*
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] result = new int[2];
        System.arraycopy(arr, arr.length - 2, result, 0, 2);
        System.out.println("Результат: " + Arrays.toString(result));
*/
    }
}
