package code_mu.level2;

/**
 * Уровень 2.2 задачника Java
 * № 22.3
 * <p>
 * /**
 * Уровень 2.1 задачника Java
 * № 21.1
 * <p>
 * Дан массив с целыми числами:
 * <p>
 * int[] arr = {1, 2, 3, 4, 5};
 * Найдите сумму элементов этого массива.
 */

public class _223_SumArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
/*
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
*/
        System.out.println("\nСумма всех элементов массива: " + sum);
    }

}
