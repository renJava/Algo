package code_mu.level4;

import java.util.Arrays;

public class _413a_ArrayWithoutZeroByStream {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 3, 0, 5};
        int[] arr2 = removeZeros(arr1);

        // Выводим новый массив
        System.out.print("arr2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeZeros(int[] arr) {
        return Arrays.stream(arr)
                .filter(num -> num != 0)
                .toArray();
    }
}
