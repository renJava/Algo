package fibonacci;

import java.math.BigDecimal;

public class FibonacciRecursionMemoizationArrayTimer {
    private static BigDecimal[] memo;

    public static void main(String[] args) {
        int n = 30000; // Количество чисел Фибоначчи для вычисления
        memo = new BigDecimal[n + 1]; // Создаем массив для хранения вычисленных значений

        long startTime = System.currentTimeMillis(); // Записываем текущее время перед выполнением операции

        for (int i = 0; i < n; i++) {
            BigDecimal result = fibMemoization(i);
            System.out.print(result + "\n");
        }

        long endTime = System.currentTimeMillis(); // Записываем текущее время после выполнения операции
        long totalTime = endTime - startTime; // Вычисляем общее время выполнения в миллисекундах

        System.out.println("\nОбщее время выполнения: " + totalTime + " мс");
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