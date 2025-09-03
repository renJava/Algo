package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.1 задачника Java
 * № 31.4
 * <p>
 * Дан массив:
 *
 * int[] [1, 2, 3, 4, 5, 6]
 * Получите из него следующий срез:
 *
 * int[] [1, 2, 3]
 */

public class _314_GetSliceOfArray {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] result = new int[3];
        System.arraycopy(arr, 0, result, 0, 3);
        System.out.println("Результат: " + Arrays.toString(result));
    }
/*
arr: исходный массив, из которого будут копироваться элементы.
0: начальный индекс в исходном массиве (где начинается копирование).
result: массив, в который будут копироваться элементы.
0: начальный индекс в целевом массиве (где будут вставляться скопированные элементы).
3: количество элементов для копирования.
*/
}
