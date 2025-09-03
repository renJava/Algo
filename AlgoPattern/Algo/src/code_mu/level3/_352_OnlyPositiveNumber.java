package code_mu.level3;

/**
 * Уровень 3.5 задачника Java
 * № 32.2
 * <p>
 * Дан массив с числами. Проверьте, что все элементы этого массива являются положительными числами.
 */

public class _352_OnlyPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -5, 7, 8};
        boolean isNegative = false;

        for (int ignored : arr) {
            if (ignored < 0) {
                isNegative = true;
                break;
            }
        }

        System.out.println(isNegative
                ? "Не! Массив содержит отрицательное число"
                : "Массив состоит ТОЛЬКО из положительных чисел"

        );
/*
        int[] arr = {1, 2, 3, -5, 7, 8};
        int countPositive = 0;
        for (int numb : arr) {
            if (numb > 0) countPositive++;
        }
        System.out.println(countPositive == arr.length
                ? "Массив состоит из положительных чисел"
                : "Не! Массив содержит отрицательное число");
*/
    }
}
