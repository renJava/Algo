package fibonacci;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursionMemoizationHashMap {
    private static final Map<Integer, BigDecimal> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10000; // Количество чисел Фибоначчи для вычисления

        for (int i = 0; i < n; i++) {
            System.out.print(fibMemoization(i) + "\n");
        }
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