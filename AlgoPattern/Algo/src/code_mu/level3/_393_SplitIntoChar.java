package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.9 задачника Java
 * № 39.2
 * <p>
 Дан массив со строками:
 String[] arr = {"ab", "cd", "ef"};
 Получите массив символов этих строк:
 chars[] {'a', 'b', 'c', 'd', 'e', 'f'};
 */

public class _393_SplitIntoChar {
    public static void main(String[] args) {
        String[] arr = {"ab", "cd", "ef"};
        char[] chars = new char[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            chars[i * 2] = arr[i].charAt(0);
            chars[i * 2 + 1] = arr[i].charAt(1);
        }
        System.out.println("Результат: " + Arrays.toString(chars));
    }
}
