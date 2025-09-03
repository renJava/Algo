package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.8 задачника Java
 * № 38.4
 * <p>
 * Дана строка:
 * String str = "abcde";
 * Получите массив символов этой строки:
 * char[] {'a', 'b', 'c', 'd', 'e'}
 */

public class _384_CharArrayStream {
    public static void main(String[] args) {
        String str = "abcde";
        char[] chars = str.toCharArray();
        System.out.println("Результат: " + Arrays.toString(chars));
    }
}
