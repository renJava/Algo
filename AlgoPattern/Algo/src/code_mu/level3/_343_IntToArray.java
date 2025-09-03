package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.4 задачника Java
 * № 34.3
 * <p>
 * Дано некоторое число:
 * <p>
 * int 12345
 * Получите массив цифр этого числа:
 * <p>
 * byte[] {1, 2, 3, 4, 5}
 */

public class _343_IntToArray {
    public static void main(String[] args) {
        int in = 12345;
        byte[] arr = Integer.toString(in).getBytes();

        for (int i = 0; i < arr.length; i++) arr[i] -= '0';

        System.out.println("Результат: " + Arrays.toString(arr));
    }
}
