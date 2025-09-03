package code_mu.level2;

/**
 * Уровень 2.4 задачника Java
 * № 24.1
 * <p>
 * Дан массив с числами:
 *
 * int[] arr = [1, 2, 3, 4, 5];
 * Найдите сумму квадратных корней элементов этого массива.
 */

public class _241_SQRT_SumArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 10};
        double sum = 0;

        for (int j : arr) {
            sum += Math.sqrt(j);
        }

/*
        for (int i = 0; i < arr.length; i++) {
            sum += Math.sqrt(arr[i]);
        }
*/
        System.out.println("Сумма квадратных корней элементов массива: " + sum);
    }
}
