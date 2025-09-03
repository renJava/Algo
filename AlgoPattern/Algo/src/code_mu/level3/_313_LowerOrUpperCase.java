package code_mu.level3;

/**
 * Уровень 3.1 задачника Java
 * № 31.3
 * <p>
 * Дан символ:
 *
 * char chr = 'a';
 * Узнайте, в каком регистре этот символ: в верхнем или нижнем.
 */

public class _313_LowerOrUpperCase {
    public static void main(String[] args) {
        char chr = 'А';
        System.out.println("Регистр символа: " + Character.isUpperCase(chr));
    }
}
