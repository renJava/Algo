package code_mu.level4;

/**
 Дана некоторая строка с буквами и цифрами. Получите позицию первой цифры в этой строке.
 */
public class _411_FindFirstDigit {
    public static void main(String[] args) {
        String str = "abc1def2ghi3jkl4mno5pqr6stuv7wxy8z1234567890";
        String str2 = "abc";
        System.out.println("Позиция первой цифры в строке: " + findFirstDigit(str2));
    }

    private static String findFirstDigit(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                return String.valueOf(i);
            }
        }
        return "Нет цифр";
    }
}
