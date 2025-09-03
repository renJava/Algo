package code_mu.level1;

/**
 * Уровень 18 задачника Java
 * № 183
 * <p>
 * Дано целое число, содержащее количество байт:
 * <p>
 * int b = 3535645778;
 * Переведите это значение в гигабайты, мегабайты и килобайты.
 */

public class _183_BtToGbMbKb {
    public static void main(String[] args) {
        long b = 3_535_645_778l;
        if (b < 1_000_000_000) return;

        long kb = b / 1024;
        long mb = kb / 1024;
        long gb = mb / 1024;

        System.out.println("\n" + b + " байт, это:\n");
        System.out.println("Гигабайты: " + gb);
        System.out.println("Мегабайты: " + mb);
        System.out.println("Килобайты: " + kb);
    }
}
