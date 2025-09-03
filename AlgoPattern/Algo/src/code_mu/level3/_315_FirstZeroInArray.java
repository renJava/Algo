package code_mu.level3;

/**
 * Уровень 3.1 задачника Java
 * № 31.5
 * <p>
 * Дан массив с целыми числами:
 * <p>
 * int[] arr = {1, 2, 3, 0, 4, 5};
 * Выведите в консоль позицию первого нуля.
 */

public class _315_FirstZeroInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("Позиция первого нуля: " + (i + 1));
                break;
            }
        }

/*
        int[] arr = {1, 2, 3, 0, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("Позиция первого нуля: " + (i + 1));
                break;
            }
        }
*/
    }
}
