package code_mu.level4;

import java.util.Arrays;

/**
 * Даны два массива:
 * <p>
 * int[] arr1 = [1, 2, 3, 4, 5];
 * int[] arr2 = [1, 2, 3];
 * Проверьте, что все элементы первого массива есть во втором.
 */

public class _424_CompareArrayContents {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};

        boolean allElementsExist = Arrays.stream(arr1)
                .allMatch(num -> Arrays.stream(arr2).anyMatch(element -> element == num));

        System.out.println("Все элементы первого массива есть во втором: " + allElementsExist);
    }
}
