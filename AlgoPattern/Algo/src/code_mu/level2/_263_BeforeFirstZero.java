package code_mu.level2;

/**
 * Уровень 2.6 задачника Java
 * № 26.3
 * <p>
 Дан массив с целыми числами:

 int[] arr = {1, 2, 3, 0, 4, 5};
 Выведите в консоль элементы этого массива до первого нуля.
 */

public class _263_BeforeFirstZero {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, 5};
        System.out.print("\nBefore first 0: ");
        for (int j : arr) {
            if (j == 0) break;
            System.out.print(j + " ");
        }

/*
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                break;
            }
            System.out.println(arr[i]);
        }
*/
    }
}
