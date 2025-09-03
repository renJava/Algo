package code_mu.level2;

/**
 * Уровень 2.8 задачника Java
 * № 28.3
 * <p>
 * Дана строка:
 *
 * String str = "12345";
 * Получите первый и последний символ этой строки в следующем виде:
 *
 * String "15";
 */

public class _283_FirstAndLastNumberInString {
    public static void main(String[] args) {
        String str = "12345";
//        System.out.println(str.charAt(0) + str.charAt(str.length() - 1));
        System.out.println("" + str.charAt(0) + str.charAt(str.length() - 1));
    }
}
