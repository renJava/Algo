package factorial;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
 */
public class Factorial147_2_Recursive {
    public static BigInteger factorial(int value) {
        if (value < 0)
            throw new IllegalArgumentException("Ошибка!!! Аргумент факториала должен быть 0 или целым положительным числом");

        if (value == 0 || value == 1) return BigInteger.ONE;
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }

    public static void main(String[] args) {
        System.out.print("""
                    
                Прямое вычисление факториала!
                Введите аргумент факториала:\s\s""");
        Scanner scanner = new Scanner(System.in);
        int mainValue;

        try {
            mainValue = scanner.nextInt();
            System.out.println("\n\nЗначение факториала " + mainValue + ": \n" + factorial(mainValue));
        } catch (InputMismatchException e) {
            System.err.println("Ошибка!!! Введенное значение не является целым числом.");
        }
    }
}
