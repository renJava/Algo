package code_mu.level1;

/**
 * Уровень 16 задачника Java
 * № 163
 * <p>
 * Дано целое число, содержащее количество мегабайт:
 * <p>
 * int mb = 35;
 * Переведите это значение в байты.
 */

public class _163_MbtToBt {
    public static void main(String[] args) {
        int mb = 35;
        long bt = mb * 1024 * 1024;
        System.out.println("В " + mb + " мегабайтах " + bt + "\sбайт");
    }
}
