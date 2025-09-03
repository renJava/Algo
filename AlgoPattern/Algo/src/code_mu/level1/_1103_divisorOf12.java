package code_mu.level1;

/**
 * Уровень 1.10 задачника Java
 * № 1.103
 * <p>
 * Дано некоторое целое число:
 * <p>
 * int num = 12;
 * Выведите в консоль все делители этого числа.
 */

public class _1103_divisorOf12 {
    public static void main(String[] args) {
        int num = 12;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + (i != num ? ", " : "."));
        }
    }
}

