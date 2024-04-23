package fibonacci;

import java.math.BigDecimal;

public class Fibonacci1VarLoop {
    public static void main(String[] args) {
        int n = 10000; // Количество чисел Фибоначчи для вычисления

        BigDecimal a = BigDecimal.valueOf(0);
        BigDecimal b = BigDecimal.valueOf(1);
        BigDecimal c;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a.add(b);
            System.out.print(c + "\n");
            a = b;
            b = c;
        }
    }
}
