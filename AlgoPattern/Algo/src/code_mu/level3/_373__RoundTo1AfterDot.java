package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.7 задачника Java
 * № 37.3
 * <p>
 * <p>
 * Дан массив с дробями:
 * <p>
 * float[] arr = [1.456, 2.125, 3.32, 4.1, 5.34];
 * Округлите эти дроби до одного знака в дробной части.
 */

public class _373__RoundTo1AfterDot {
    public static void main(String[] args) {
        float[] arr = {1.456f, 2.125f, 3.32f, 4.1f, 5.34f};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(arr[i] * 10); // Умножение на 10 и округление до ближ. целого
            arr[i] = arr[i] / 10f;
        }
        System.out.println(Arrays.toString(arr));

/*
        for (float j : arr) {
            j = Math.round(j * 10); // Умножение на 10 и округление до ближ. целого
            j = j / 10f;
        }
*/

    }
}

//        for (float j : arr) {
//            j = Math.round(j * 10) / 10f;
