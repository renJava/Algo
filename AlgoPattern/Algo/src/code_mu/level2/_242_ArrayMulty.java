package code_mu.level2;

/**
 * Уровень 2.42 задачника Java
 * № 24.2
 * <p>
 * Дан массив с числами:
 *
 * int[] {1, 2, 3, 4};
 * Увеличьте каждый элемент этого массива в два раза:
 *
 * int[] {2, 4, 9, 8}; */

public class _242_ArrayMulty {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

        System.out.println("Умноженный массив: " + java.util.Arrays.toString(arr));

    }
}
