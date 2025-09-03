package code_mu.level3;

/**
 * Уровень 3.2 задачника Java
 * № 32.3
 * <p>
 * Дана строка:
 *
 * "abcdef"
 * Получите три последних символа этой строки:
 *
 * "def"
 */

public class _323_SubstringFromLast {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("Три последних символа строки: "
                + str.substring(str.length() - 3));
    }
}
