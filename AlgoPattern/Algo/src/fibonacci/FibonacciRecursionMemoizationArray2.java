package fibonacci;

import java.math.BigDecimal;

public class FibonacciRecursionMemoizationArray2 {
    public static BigDecimal fibRecursiveArray(int n, BigDecimal[] fibNumbers) { // ниже вложенный тернарный оператор
        return (n == 0 || n == 1) ? BigDecimal.valueOf(n) : //Походу, просто n вместо BigDecimal.valueOf(n)
                fibNumbers[n] != null ? fibNumbers[n] : (fibNumbers[n] = fibRecursiveArray(n - 2, fibNumbers)
                        .add(fibRecursiveArray(n - 1, fibNumbers)));
    }

    public static void main(String[] args) {
        int n = 10_000; // Количество чисел Фибоначчи для вычисления 10000 (10k)
        if (n < 0)
            throw new IllegalArgumentException("\n\nАргумент числа Фибоначчи должны быть целым и положительным\n");

        BigDecimal[] fibNumbers = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            fibNumbers[i] = fibRecursiveArray(i, fibNumbers);
            System.out.print(fibNumbers[i] + "\n\n");
        }
    }

}
