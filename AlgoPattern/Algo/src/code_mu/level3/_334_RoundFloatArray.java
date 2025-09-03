package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.3 задачника Java
 * № 33.4
 * <p>
 * Дан массив с дробными числами:
 *
 * float[] arr = {1.11, 2.23, 3.45, 4.66, 5.98};
 * Округлите элементы этого массива до целой части и запишите в новый массив.
 */

public class _334_RoundFloatArray {
    public static void main (String[] args) {
        float[] arr = {1.11f, 2.23f, 3.45f, 4.66f, 5.98f};
        int[] arrR = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrR[i] = Math.round(arr[i]);
        }
        System.out.println(Arrays.toString(arrR));
    }

}
