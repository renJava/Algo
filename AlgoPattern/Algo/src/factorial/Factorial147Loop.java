package factorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
 */
public class Factorial147Loop {
    public static BigInteger factorial(int value) {
//Твой код здесь
        if (value <= 0) {
            throw new IllegalArgumentException(
                    "\n\nОшибка!!! Аргумент факториала должен быть ПОЛОЖИТЕЛЬНЫМ целым числом\n");
        }
        if (value == 1) return BigInteger.ONE;
        if (value == 2) return BigInteger.TWO;


        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= value; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("""
                                
                Прямое вычисление факториала!
                Введите аргумент факториала:\s\s""");
        Scanner scanner = new Scanner(System.in);
        int mainValue = scanner.nextInt();
        System.out.println("\n\nЗначение факториала " + mainValue + ": " + factorial(mainValue));
    }
}
