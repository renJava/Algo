package code_mu.level1;

/**
 * Уровень 17 задачника Java
 * № 173
 * <p>
 * Даны три строки:
 * <p>
 * String str1 = "123";
 * String str2 = "456";
 * String str3 = "789";
 * Сложите значения этих строк как целые числа.
 */

public class _173_SumOfString {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "456";
        String str3 = "789";

        int sum = Integer.parseInt(str1) + Integer.parseInt(str2) + Integer.parseInt(str3);

        System.out.println("Результат сложения значений строк как целых чисел: " + sum);
    }
}
