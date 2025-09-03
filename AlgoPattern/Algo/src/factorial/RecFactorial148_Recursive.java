package factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class RecFactorial148_Recursive {

    public static BigInteger factorial(int value) {
        return (value == 0 || value == 1)
                ? BigInteger.ONE
                : BigInteger.valueOf(value).multiply(factorial(value - 1));
    }


    public static void main(String[] args) {
        System.out.print("""

                Рекурсивное вычисление факториала!
                Введите аргумент факториала:\s""");
        Scanner scanner = new Scanner(System.in);
        int mainValue = scanner.nextInt();
        System.out.println("\n\nЗначение факториала " + mainValue + ": \n" + factorial(mainValue));
    }
}


