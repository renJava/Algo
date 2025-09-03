package code_mu.level1;

/**
 * Уровень 1.2 задачника Java
 * № 125
 * <p>
 * Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.
 */

public class _125_FirstDigitChecker {
    static int checkerNum1 = 123456789;
    static int checkerNum2 = 12345678;

    public static void main(String[] args) {

        char firstDigitChar1 = String.valueOf(checkerNum1).charAt(0);
        char firstDigitChar2 = String.valueOf(checkerNum2).charAt(0);
/*
        if (firstDigitChar1 == firstDigitChar2) {
            System.out.println("Первые цифры совпадают");
        } else {
            System.out.println("Первые цифры не совпадают");
        }
*/
        System.out.println(firstDigitChar1 == firstDigitChar2
                ? "Первые цифры совпадают"
                : "Первые цифры не совпадают");


    }
}
