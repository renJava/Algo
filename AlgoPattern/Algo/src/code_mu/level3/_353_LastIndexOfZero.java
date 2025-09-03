package code_mu.level3;

/**
 * Уровень 3.5 задачника Java
 * № 35.3
 * <p>
 * Дана некоторая строка:
 * "1203405"
 * Найдите позицию последнего нуля в строке.
 */

public class _353_LastIndexOfZero {
    public static void main (String[] args) {
        String stringIn = "1203405";
        System.out.println("Позиция последнего ноля в строке: "
                + (stringIn.lastIndexOf("0") + 1));

    }
}
