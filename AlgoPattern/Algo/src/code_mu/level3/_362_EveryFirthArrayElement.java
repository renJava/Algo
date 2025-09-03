package code_mu.level3;

/**
 * Уровень 3.6 задачника Java
 * № 36.2
 * <p>
 * Дан массив. Выведите в консоль каждый пятый его элемент.
 */

public class _362_EveryFirthArrayElement {
    public static void main (String[] args) {
        int[] arr = {1245, 215, 2614, -278, 2, 1224, 10000, -12345, 234, 186, 128};
        System.out.println("Каждый 5-й элемент массива: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) % 5 == 0 ? arr[i] + " " : "");
        }

    }
}
