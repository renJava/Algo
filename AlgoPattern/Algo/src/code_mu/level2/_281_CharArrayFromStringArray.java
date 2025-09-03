package code_mu.level2;

import java.util.Arrays;

/**
 * Уровень 2.8 задачника Java
 * № 28.1
 * <p>
 * Дан массив со строками:
 * <p>
 * String[] arr = {"ab", "cd", "ef"};
 * Получите массив символов этих строк:
 * <p>
 * char[] {'a', 'b', 'c', 'd', 'e', 'f'}
 */

public class _281_CharArrayFromStringArray {
    public static void main(String[] args) {
        String[] arr = {"ab", "cd", "ef"};

// Преобразуем массив строк в одну строку и затем в массив символов
        String StringFromStringArray = String.join("", arr);
        char[] charArray = StringFromStringArray.toCharArray();

// Вывод результата
        System.out.println(Arrays.toString(charArray)); // ['a', 'b', 'c', 'd', 'e', 'f']
    }
}