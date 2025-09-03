package code_mu.level3;

/**
 * Уровень 3.9 задачника Java
 * № 39.1
 * <p>
 *
 * Дана некоторая строка, например, вот такая:
 *
 * String str = "023m0df0dfg0";
 * Выведите в консоль позиции всех нулей в этой в строке.
 */

public class _391_AllZeroPosition {
    public static void main (String[] args) {
        String str = "023m0df0dfg0";
        System.out.print("\nПозиции всех нулей в строке:");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                System.out.print(" " + i);
            }
        }
    }
}
