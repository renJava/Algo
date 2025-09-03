package code_mu.level1;

import java.util.Locale;

/**
 * Уровень 1.10 задачника Java
 * № 1.102
 * <p>
 *
 * Напишите программу, которая узнает, сколько секунд содержится в году.
 */

public class _1102_SecondPerYear_Form {
    public static void main(String[] args) {
        long numberOfSeconds = 365 * 24 * 60 * 60;
        String formattedNumber = String.format(Locale.US, "%,d", numberOfSeconds)
                .replace(",", "_");
        System.out.println("Секунд в году: " + formattedNumber);
    }
}