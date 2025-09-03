package code_mu.level2;

import java.util.Arrays;

/**
 * Уровень 2.1 задачника Java
 * № 21.1
 * <p>
 * Дан массив с целыми числами:
 * <p>
 * int[] arr = {1, 2, 3, 4, 5};
 * Выведите в консоль элементы этого массива.
 */

public class _211_ArrayPrint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Элементы массива: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i != arr.length - 1 ? arr[i] + ", " : arr[i] + ".\n");
        }

        // или через Arrays.toString(arr)
        System.out.println(Arrays.toString(arr));
    }
}
