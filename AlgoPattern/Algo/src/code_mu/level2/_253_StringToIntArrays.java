package code_mu.level2;

import java.util.Arrays;

/**
 * Уровень 2.5 задачника Java
 * № 25.3
 * <p>
 * Дан массив со строками, содержащими целые числа:
 * <p>
 * String[] {"123", "456", "789"};
 * Преобразуйте этот массив так, чтобы значениями нового массива стали целые числа:
 * <p>
 * int[] {123, 456, 789};
 */

public class _253_StringToIntArrays {
    private static String[] strings = {"123", "456", "789"};
    private static int[] ints = new int[strings.length];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
//            ints[i] = Integer.parseInt(strings[i]) / 2;
        }
        System.out.println("Целочисленные массив: " + Arrays.toString(ints));
    }
}
