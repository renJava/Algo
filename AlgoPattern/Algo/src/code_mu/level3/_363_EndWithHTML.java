package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.6 задачника Java
 * № 36.3
 * <p>
 *
 * Дан массив со строками. Оставьте в этом массиве только те строки, которые заканчиваются на ".html".
 */

public class _363_EndWithHTML {
    public static void main(String[] args) {
        String[] str = new String[]{"len", "def", "jhi.html"};
        for (int i = 0; i < str.length; i++) {
            if (!str[i].endsWith(".html")) {
                str[i] = null;
            }
        }

        System.out.println("Результирующий массив: " + Arrays.toString(str));
    }
}
