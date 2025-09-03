package code_mu.level2;

/**
 * Уровень 2.3 задачника Java
 * № 23.1
 * <p>
 * Дан массив:
 *
 * int[10] arr;
 * С помощью цикла заполните этот массив целыми числами от 10 до 1.
 */

public class _243_ArrayFillIn_10_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 - i;
        }
        System.out.println("Массив наоборот: " + java.util.Arrays.toString(arr));
    }
}
