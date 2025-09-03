package code_mu.level2;

/**
 * Уровень 2.3 задачника Java
 * № 23.3
 * <p>
 * Дан массив:
 *
 * int[10] arr;
 * С помощью цикла заполните этот массив целыми числами от 1 до 10.
 */

public class _233_FillArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Заполненный массив - усовершенствованный цикл: ");
        System.out.print("[");
        for (int i : arr) {
            System.out.print    (i + (i != 10 ? ", " : ""));
        }
        System.out.print("]\n");


        System.out.println("Вывод заполненного массива через Arrays.toString: "
                + java.util.Arrays.toString(arr));
    }
}
