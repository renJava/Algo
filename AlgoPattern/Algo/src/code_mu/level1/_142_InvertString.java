package code_mu.level1;

/**
 * Уровень 14 задачника Java
 * № 142
 * <p>
 * Дана некоторая строка:
 * String str = "abcde";
 * Переберите и выведите в консоль по очереди все символы с конца строки.
 */

public class _142_InvertString {
    public static void main (String[] args) {
        String str = "abcde";

        System.out.print("\nСтрока наизнанку: ");

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
