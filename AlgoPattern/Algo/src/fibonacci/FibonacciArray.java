package fibonacci;

import java.math.BigDecimal;

public class FibonacciArray {
    public static void main(String[] args) {
        int n = 10000; // Количество чисел Фибоначчи для вычисления

        BigDecimal[] fibNumbers = new BigDecimal[n];
        fibNumbers[0] = BigDecimal.ZERO;
        fibNumbers[1] = BigDecimal.ONE;

        System.out.print(1 + " ");

        for (int i = 2; i < n; i++) {
            fibNumbers[i] = fibNumbers[i - 2].add(fibNumbers[i - 1]);
            System.out.print(fibNumbers[i] + "\n");
        }
    }
}