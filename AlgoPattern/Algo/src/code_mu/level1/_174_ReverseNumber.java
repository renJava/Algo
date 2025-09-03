package code_mu.level1;

/**
 * Уровень 17 задачника Java
 * № 174
 * <p>
 * Дано некоторое число:
 * <p>
 * 12345
 * Переверните его:
 * <p>
 * 54321
 */

public class _174_ReverseNumber {
    public static void main(String[] args) {
        int originInt = 12345;
        int reverseInt = Integer.parseInt(new StringBuilder(String.valueOf(originInt))
                .reverse().toString());
        System.out.println("Перевёрнутое число: " + reverseInt);
    }
}
