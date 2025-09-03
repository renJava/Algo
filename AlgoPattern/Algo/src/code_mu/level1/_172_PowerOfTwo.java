package code_mu.level1;

/**
 * Уровень 17 задачника Java
 * № 172
 * <p>
 * Напишите код, который выведет первые N степеней двойки.
 */

public class _172_PowerOfTwo {
    public static void main(String[] args) {
        int n = 5;
        int powerOfTwo = (int) Math.pow(2, n);
        System.out.println("Двойка в степени: " + n + " = " + powerOfTwo);
    }
}
