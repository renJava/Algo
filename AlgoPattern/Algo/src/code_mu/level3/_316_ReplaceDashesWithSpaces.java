package code_mu.level3;

/**
 * Уровень 3.1 задачника Java
 * № 31.6
 * <p>
 * Дана строка:
 *
 * "123-456-789"
 * Замените все дефисы на пробелы:
 *
 * "123 456 789"
 */

public class _316_ReplaceDashesWithSpaces {
    public static void main(String[] args) {
        String str = "123-456-789";
        System.out.println("Результат: " + str.replace("-", " "));
    }
}
