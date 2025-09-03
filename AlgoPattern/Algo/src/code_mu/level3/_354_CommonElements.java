package code_mu.level3;

/**
 * Уровень 3.5 задачника Java
 * № 35.4
 * <p>
 * Даны два массива:
 * <p>
 * int[] arr1 = [1, 2, 3, 4, 5];
 * int[] arr2 = [4, 5, 6, 7, 8];
 * Выведите в консоль общие элементы этих массивов:
 * <p>
 * 4
 * 5
 */

public class _354_CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k) {
                    System.out.println(j);
                }
            }
        }
    }
}
