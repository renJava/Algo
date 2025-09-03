package code_mu.level3;

/**
 * Уровень 3.1 задачника Java
 * № 31.2
 * <p>
 * Дана строка:
 *
 * "abcdef"
 * Получите первых три символа этой строки:
 *
 * "abc"
 */

public class _312_FirstThreeFromString {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("Первые три символа строки: " + str.substring(0, 3));
    }
}
