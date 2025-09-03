package code_mu.level3;

/**
 * Уровень 3.7 задачника Java
 * № 37.5
 * <p>
 * Дано некоторое число, например, такое:
 * <p>
 * int num = 123789;
 * Удалите из этого числа все нечетные цифры. В нашем случае получится такой результат:
 * <p>
 * 28
 */

public class _375_DeleteOddInInt {
    public static void main(String[] args) {
        int num = 123789;
        System.out.println("Выводим только четные цифры: " + deleteOddInInt(num));
    }

    private static String deleteOddInInt(int numIn) {
        char charArray[] = Integer.toString(numIn).toCharArray();
        StringBuilder result = new StringBuilder();
        for (int j : charArray) if (j % 2 == 0) result.append(j - '0');

        return result.toString();
    }

}
