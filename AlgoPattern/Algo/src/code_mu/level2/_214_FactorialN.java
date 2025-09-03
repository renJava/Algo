package code_mu.level2;

import java.util.Locale;

/**
 * Уровень 2.1 задачника Java
 * № 21.4
 * <p>
 * <p>
 * Дано некоторое целое число:
 * <p>
 * byte num = 12;
 * Найдите факториал этого числа.
 */

public class _214_FactorialN {
    public static Long factorial(byte num) {
        return (num == 0 || num == 1)
                ? 1
                :  num * factorial((byte) (num - 1));
    }

    public static void main(String[] args) {
        byte num = 12;
        String formattedFactorial = String.format(Locale.US, "%,d", factorial(num))
                .replace(",", "_");

        System.out.println("\nФакториал " + num + "!" + " = " + formattedFactorial);
    }
}




