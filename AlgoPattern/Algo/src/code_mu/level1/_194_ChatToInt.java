package code_mu.level1;

/**
 * Уровень 1.9 задачника Java
 * № 194
 * <p>
 * Даны три символа:
 * <p>
 * char chr1 = '1';
 * char chr2 = '2';
 * char chr3 = '3';
 * Слейте эти символы в число:
 * <p>
 * int 123
 */

public class _194_ChatToInt {
    public static void main(String[] args) {
        char chr1 = '1';
        char chr2 = '2';
        char chr3 = '3';
        int concat = (chr1 - '0') * 100 + (chr2 - '0') * 10 + (chr3 - '0');
        System.out.println("Слив чаров в целое: " + concat);
    }
}
