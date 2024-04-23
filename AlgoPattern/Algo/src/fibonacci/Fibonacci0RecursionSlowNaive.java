package fibonacci;

public class Fibonacci0RecursionSlowNaive {
    public static void main(String[] args) {
        int n = 45; // Количество чисел Фибоначчи для вычисления
        for (int i = 0; i < n; i++) {
            System.out.print(fibSlowNaive(i) + "\n");
        }
    }

    public static int fibSlowNaive(int n) {
        if (n <= 1) return n;
        return fibSlowNaive(n - 2) + fibSlowNaive(n - 1);
    }
}
