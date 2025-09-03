package code_mu.level1;

/**
 * Уровень 15 задачника Java
 * № 151
 * <p>
 * Выведите в консоль все числа кратные трем в промежутке от 1 до 100.
 */

public class _151_multiple3 {
    public static void main(String[] args) {
        System.out.println("Числа кратные 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0) System.out.println();
            if (i % 3 == 0) System.out.print(i + ", ");
        }

    }
}

