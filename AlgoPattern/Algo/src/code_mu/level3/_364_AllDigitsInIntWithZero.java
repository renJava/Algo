package code_mu.level3;

/**
 * Уровень 3.6 задачника Java
 * № 36.4
 * <p>
 * Дано число, например, вот такое:
 * int num = 12345;
 * Проверьте, что все цифры этого числа больше нуля.
 */

public class _364_AllDigitsInIntWithZero {
    public static void main(String[] args) {
        int num = -2 * 273 + 500;
        System.out.println("Все цифры числа больше нуля ? "
                + allDigitsPositive(num));
    }

    private static boolean allDigitsPositive(int numeric) {
        char[] numChar = Integer.toString(numeric).toCharArray();

        for (int j : numChar) {
            if (j < '0') {
                return false;
            }

        }

        return true;
    }

}

/*
    public static boolean allDigitsPositive(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        for (char c : chars) {
            if (c < '0') return false;
        }
        return true;
    }
*/

