package fibonacci;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursionMemoizationHashMapTimer {
    private static final Map<Integer, BigDecimal> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 30000; // Количество чисел Фибоначчи для вычисления

        long startTime = System.currentTimeMillis(); // Записываем текущее время перед выполнением операции

        for (int i = 0; i < n; i++) {
            System.out.print(fibMemoization(i) + "\n");
        }

        long endTime = System.currentTimeMillis(); // Записываем текущее время после выполнения операции
        long totalTime = endTime - startTime; // Вычисляем общее время выполнения в миллисекундах

        System.out.println("\nОбщее время выполнения: " + totalTime + " мс");
    }

    public static BigDecimal fibMemoization(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n); // Если значение уже вычислено, возвращаем его из memo
        }

        BigDecimal result;
        if (n <= 1) {
            result = BigDecimal.valueOf(n);
        } else {
            result = fibMemoization(n - 2).add(fibMemoization(n - 1));
        }

        memo.put(n, result); // Сохраняем вычисленное значение в memo
        return result;
    }
}