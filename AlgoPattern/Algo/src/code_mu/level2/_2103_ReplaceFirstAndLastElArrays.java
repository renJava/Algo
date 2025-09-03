package code_mu.level2;

import java.util.Arrays;

/**
 * Уровень 2.10 задачника Java
 * № 210.4
 * <p>
 * Дан массив с целыми числами:
 *
 * int[] {1, 2, 3, 4, 5};
 * Поменяйте местами первый и последний элементы этого массива:
 *
 * int[] {5, 2, 3, 4, 1};
 */

public class _2103_ReplaceFirstAndLastElArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int tmp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;
        System.out.println("Массив после замены: " + Arrays.toString(arr));
    }
}
