package code_mu.level2;

import java.util.Arrays;

/**
 * Уровень 2.5 задачника Java
 * № 25.2
 * <p>
 * Дан массив с числами:
 *
 * int[] arr = {1, 2, 3, 4, 5};
 * Выведите в консоль элементы этого массива в обратном порядке.
 */

public class _252_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Элементы массива: " + Arrays.toString(arr) + " в обратном порядке: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + (i == 0 ? "." : ", "));
        }
//        System.out.println(Arrays.toString(arr));
    }
}
