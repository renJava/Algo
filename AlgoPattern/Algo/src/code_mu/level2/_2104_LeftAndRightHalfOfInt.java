package code_mu.level2;

/**
 * Уровень 2.10 задачника Java
 * № 210.4
 * <p>
 * Дано число из 6-ти цифр
 * <p>
 * int num = 123321;
 * Проверьте, что сумма первых трех цифр равняется сумме вторых трех цифр.
 */

public class _2104_LeftAndRightHalfOfInt {
    public static void main(String[] args) {
        int num = -123321;   // 12332100
        char[] arr = num >= 0
                ? String.valueOf(num).toCharArray()
                : String.valueOf(Math.abs(num)).toCharArray();

        int charArrayLength = arr.length;

        if (charArrayLength % 2 != 0) { // Количество цифр должны быть четное
            System.out.println("false");
            return;
        }
        int sumLeft = 0;
        int sumRight = 0;
        int charArrayLengthHalf = charArrayLength / 2;

        for (int i = 0; i < charArrayLengthHalf; i++) {
            sumLeft += arr[i];
            sumRight += arr[i + charArrayLengthHalf];
        }

        System.out.println(sumLeft == sumRight && charArrayLength != 0
                ? "Сумма первых трех цифр равняется сумме вторых трех цифр"
                : "false");

    }
}
