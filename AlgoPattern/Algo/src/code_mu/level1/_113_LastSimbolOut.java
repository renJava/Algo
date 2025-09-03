package code_mu.level1;

/**
 * Уровень 1.1 задачника Java
 * № 113
 * <p>
 * Дана строка. Выведите в консоль последний символ строки.
 */

public class _113_LastSimbolOut {
    static String lastSymbol = "Последний символ строки";   // Последний символ строки

    public static void main(String[] args) {
        System.out.println(lastSymbol + ": " + lastSymbol.charAt(lastSymbol.length() - 1));
    }
}