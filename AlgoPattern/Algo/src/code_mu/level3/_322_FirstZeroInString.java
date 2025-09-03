package code_mu.level3;

/**
 * Уровень 3.2 задачника Java
 * № 32.2
 * <p>
 * Дана некоторая строка.
 *
 * "1203405"
 * Найдите позицию первого нуля в строке.
 */

public class _322_FirstZeroInString {
    public static void main(String[] args) {
        String str = "1203405";
        System.out.println("Результат: " + str.indexOf("0"));
    }
}
