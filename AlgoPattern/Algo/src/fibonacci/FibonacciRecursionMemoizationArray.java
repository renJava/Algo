package fibonacci;

import java.math.BigDecimal;

public class FibonacciRecursionMemoizationArray {
    private static BigDecimal[] memo;

    public static void main(String[] args) {
        int n = 10000; // Количество чисел Фибоначчи для вычисления
        memo = new BigDecimal[n + 1]; // Создаем массив для хранения вычисленных значений

        for (int i = 0; i < n; i++) {
            System.out.print(fibMemoization(i) + "\n");
        }
    }

    public static BigDecimal fibMemoization(int n) {
        if (memo[n] != null) {
            return memo[n]; // Если значение уже вычислено, возвращаем его из массива
        }

        BigDecimal result;
        if (n <= 1) {
            result = BigDecimal.valueOf(n);
        } else {
            result = fibMemoization(n - 2).add(fibMemoization(n - 1));
        }

        memo[n] = result; // Сохраняем вычисленное значение в массиве
        return result;
    }
}