package code_mu.level3;

/**
 * Уровень 3.5 задачника Java
 * № 35.5
 * <p>
 * Дана строка:
 *
 * String str = "abc def jhi";
 * Подсчитайте количество слов в этой строке.
 */

public class _355_HowManyWords {
    public static void main (String[] args) {
        String str = "abc def jhi";
        String[] strArray = str.split(" ");
        System.out.println("Количество слов в строке: " + strArray.length);
    }
}
