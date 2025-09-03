package code_mu.level3;

/**
 * Уровень 3.8 задачника Java
 * № 38.1
 * <p>
 * Дана некоторая строка:
 * <p>
 * "12034050607"
 * Найдите позицию третьего нуля в строке.
 */

public class _382_ThirdZeroPosition {
    public static void main(String[] args) {
        String s = "12034050607";
        System.out.println("Позицию 3-го нуля в строк: " + zeroPosition(s));
    }

    private static String zeroPosition(String stringIn) {
        int position = 0;
        for (int i = 0; i < stringIn.length(); i++) {
            if (Character.getNumericValue(stringIn.charAt(i)) == 0) {
                position++;
                if (position == 3) return String.valueOf(i);
            }
        }

/*
        for (int i = 0; i < stringIn.length(); i++) {
            if (Character.getNumericValue(stringIn.charAt(i)) == 0 && ++position == 3) {
                return Integer.toString(i);
            }
        }
*/

        return "Нема";
    }
}
