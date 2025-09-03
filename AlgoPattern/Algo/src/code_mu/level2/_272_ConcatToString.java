package code_mu.level2;

/**
 * Уровень 2.7 задачника Java
 * № 27.2
 * <p>
 * <p>
 * Дан массив с числами:
 * <p>
 * int[] arr = {1, 2, 3, 4, 5};
 * Слейте элементы этого массива в строку:
 * <p>
 * "12345"
 */

public class _272_ConcatToString {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("\nРезультат конкатенации элементов массива: ");
        String str = "";
        for (int j : arr) {
            str += j;
        }
        System.out.println(str);
    }
}
