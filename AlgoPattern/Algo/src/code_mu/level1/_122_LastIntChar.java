package code_mu.level1;

/**
 * Уровень 1.2 задачника Java
 * № 122
 * <p>
 * Дано целое число. Выведите в консоль последнюю цифру этого числа.
 */

public class _122_LastIntChar {
    static int lastInt = 456789;

    public static void main(String[] args) {
        String lastIntString = String.valueOf(lastInt);
        char lastIntChar = lastIntString.charAt(lastIntString.length() - 1);
        System.out.println("Последняя цифра целого числа: " + lastIntChar);
    }
}
