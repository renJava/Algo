package code_mu.level3;

/**
 *
 Дано целое число:

int num = 10203304506;
 Выведите в консоль позиции всех цифр 0 в этом числе, за исключением первой и последней.
 */
public class _3101_ZeroPositionWithout {
    public static void main (String[] args) {
        long num = 10_203_304_506L;
        String numStr = Long.toString(num);

        // Находим первую и последнюю позицию '0'
        int firstZeroIndex = numStr.indexOf('0');
        int lastZeroIndex = numStr.lastIndexOf('0');
        System.out.println("Позиции правильных нулей:");

        // Перебираем цифры, исключая первую и последнюю позиции
        for (int i = 1; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) == '0' && i != firstZeroIndex && i != lastZeroIndex) {
                System.out.print(i + " ");
            }
        }
    }
}
