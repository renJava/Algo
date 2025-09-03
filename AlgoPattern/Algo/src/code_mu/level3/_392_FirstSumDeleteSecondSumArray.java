package code_mu.level3;

/**
 * Уровень 3.9 задачника Java
 * № 39.2
 * <p>
 * Дан некоторый массив, например, вот такой:
 * int arr = {1, 2, 3, 4, 5, 6};
 * Поделите сумму первой половины элементов этого массива на сумму второй половины элементов.
 */
public class _392_FirstSumDeleteSecondSumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
            sum2 += arr[arr.length - 1 - i];
        }
        System.out.println("Результат: " + (double)sum1/sum2);
    }
}
