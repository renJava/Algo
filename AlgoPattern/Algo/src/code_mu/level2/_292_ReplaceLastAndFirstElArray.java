package code_mu.level2;

import java.util.Arrays;

/**
 * Уровень 2.3 задачника Java
 * № 29.2
 * <p>
 * Дан массив с целыми числами:
 * <p>
 * int[] {1, 2, 3, 4, 5};
 * Поменяйте местами первый и второй элементы этого массива:
 * <p>
 * int[] {2, 1, 3, 4, 5};
 */

public class _292_ReplaceLastAndFirstElArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Через сумму и разность
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];


/*
        //Через временную переменную
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
*/

        System.out.print("\nРезультирующий массив: \n" + Arrays.toString(arr));
    }
}
