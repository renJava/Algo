package code_mu.level3;

/**
 * Уровень 3.4 задачника Java
 * № 34.2
 * <p>
 Дано некоторое целое число:

 int num = 1357;
 Проверьте, что все цифры этого числа являются нечетными.
 */

public class _342_IntIsOdd {
    public static void main(String[] args) {
        int num = 1307;
        char[] numChar = Integer.toString(num).toCharArray();
        boolean isOdd = true;

        for (int j : numChar) {
            if (j % 2 == 0) {
                isOdd = false;
                break;
            }
        }
        System.out.println("Все цифры числа " + num + " нечетные ? " + isOdd);

    }
}
