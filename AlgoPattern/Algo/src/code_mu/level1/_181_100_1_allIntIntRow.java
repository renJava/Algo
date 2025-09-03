package code_mu.level1;

/**
 * Уровень 18 задачника Java
 * № 181
 * <p>
 * Выведите в консоль все целые числа от 100 до 1.
 */

public class _181_100_1_allIntIntRow {

    public static void main(String[] args) {
        System.out.println();
        for (int i = 100; i >= 1; i--) {
            System.out.print(i != 1 ? i + ", " : i + ".");
            if (i % 10 == 0) System.out.println();

        }
    }
}
