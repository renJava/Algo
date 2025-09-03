package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.4 задачника Java
 * № 34.4
 * <p>
 * <p>
 * Даны два массива:
 * <p>
 * int[] arr1 = [1, 2, 3];
 * int[] arr2 = [4, 5, 6];
 * Объедините эти массивы в один:
 * <p>
 * int[] {1, 2, 3, 4, 5, 6}
 */

public class _344_ArraysMerge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int arrLength1 = arr1.length;

        int[] arr2 = {4, 5, 6};
        int arrLength2 = arr2.length;

        int[] resultArray = new int[arrLength1 + arrLength2];
        System.arraycopy(arr1, 0, resultArray, 0, arrLength1);
        System.arraycopy(arr2, 0, resultArray, arrLength1, arrLength2);
        System.out.println("Результирующий массив: " + Arrays.toString(resultArray));
    }

}
