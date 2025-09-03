package code_mu.level1;

/**
 * Уровень 16 задачника Java
 * № 162
 * <p>
 * Даны три символа:
 * <p>
 * char chr1 = '1';
 * char chr2 = '2';
 * char chr3 = '3';
 * Сложите значения этих символов как целые числа.
 */

public class _162_ConcatAsInt {
    public static void main(String[] args) {
        char chr1 = '1';
        char chr2 = '2';
        char chr3 = '3';

        int result = (chr1 - '0') + (chr2 - '0') + (chr3 - '0');

        System.out.println("Результат сложения символов-чисел : " + result);
    }
}
