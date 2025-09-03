package code_mu.level3;

/**
 * Уровень 3.4 задачника Java
 * № 34.1
 * <p>
 * Дан массив с числами
 * <p>
 * int[] arr = [1, -2, -3, 4, -5, 6];
 * Подсчитайте количество отрицательных чисел в этом массиве.
 */

public class _341_CountNegativeDigital {
    public static void main(String[] args) {
        int[] arr = {1, -2, -3, 4, -5, 6};
        int count = 0;

        for (int j : arr) {
            if (j < 0) count++;
        }

        System.out.println("Количество отрицательных чисел в массиве: " + count);
    }

}


