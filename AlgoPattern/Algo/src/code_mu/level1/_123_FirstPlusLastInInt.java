package code_mu.level1;

/**
 * Уровень 1.2 задачника Java
 * № 123
 * <p>
 * Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.
 */

public class _123_FirstPlusLastInInt {
    static int originalNumber = - 985231;
    static String originalNumberToString = String.valueOf(Math.abs(originalNumber));
    static int numberLength = originalNumberToString.length(); //originalNumber.length();

    public static void main(String[] args) {
        int firstNumber = Character.getNumericValue(originalNumberToString.charAt(0)); //originalNumberToString.charAt(0);
        int lastNumber = Character.getNumericValue(originalNumberToString.charAt(numberLength - 1));
        System.out.println("Сумма первой и последней цифры числа: " + (firstNumber + lastNumber));

    }
}
