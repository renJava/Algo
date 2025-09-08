package code_mu.level4;

/**
 Дано целое число:

 int num = 12;
 Выведите в консоль все делители этого числа.
 */

public class _423_Divisors {
    public static void main(String[] args) {
        int num = 12;

        System.out.println("Делители числа " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
