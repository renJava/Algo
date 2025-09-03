package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.6 задачника Java
 * № 36.5
 * <p>
 * Даны три массива:
 * int[] arr1 = [1, 2, 3];
 * int[] arr2 = [4, 5, 6];
 * int[] arr3 = [7, 8, 9];
 * Объедините эти массивы в один:
 *
 * int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}
 */

public class _365_ThreeArraysMerge {
    public static void main (String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        System.out.println("Объединили 3 массива: " + mergeThreeArrays(arr1, arr2, arr3));
    }

    private static String mergeThreeArrays(int[] arrWork1, int[] arrWork2, int[] arrWork3) {
        int[] toArrResult = new int[arrWork1.length + arrWork2.length + arrWork3.length];

        System.arraycopy(arrWork1, 0, toArrResult, 0, arrWork1.length);
        System.arraycopy(arrWork2, 0, toArrResult, arrWork1.length, arrWork2.length);
        System.arraycopy(arrWork3, 0, toArrResult, (arrWork1.length + arrWork2.length),
                arrWork3.length);

/*

        System.arraycopy(arrWork1, 0, toArrResult, 0, arrWork1.length);
        System.arraycopy(arrWork2, 0, toArrResult, arrWork1.length, arrWork2.length);
        System.arraycopy(arrWork3, 0, toArrResult, arrWork1.length + arrWork2.length, arrWork3.length);
        String[] toArrResult = new String[arrWork1.length + arrWork2.length + arrWork3.length];
*/
        return Arrays.toString(toArrResult);
    }
}
