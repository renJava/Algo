package code_mu.level3;

/**
 * Уровень 3.7 задачника Java
 * № 37.2
 * <p>
 * Дана строка. Проверьте, что эта строка состоит только из четных цифр.
 */

public class _372_OnlyOddDigitsInString {
    public static void main (String[] args) {
        long num = 1234567890L;
        String str = Long.toString(num);
//        System.out.println("Все цифры числа " + num + " четные ?\n" + str.matches("^[2468]*"));

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) % 2 != 0) {
                System.out.println("Все цифры числа " + num + " четные ?\n" + false);
                break;
            } else if (i == str.length() - 1) {
                System.out.println("Все цифры числа " + num + " четные ?\n" + true);
            }
        }
    }
}
