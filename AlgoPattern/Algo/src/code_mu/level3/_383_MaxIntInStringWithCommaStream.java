package code_mu.level3;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Уровень 3.8 задачника Java
 * № 38.3
 * <p>
 * Через запятую написаны целые числа:
 * String str = "1,2,10,100,3";
 * Получите максимальное из этих чисел.
 */

public class _383_MaxIntInStringWithCommaStream {
    public static void main(String[] args) {
//        String str = "";
        String str = "1,2,10,100,3000,1L,3?> ";
        System.out.println("Максимальное число в массиве: " + findMax(str));
    }

    private static OptionalInt findMax(String strM) {

        OptionalInt maxIn = Arrays.stream(strM.split(","))
                .map(String::trim)
                .filter(s -> s.matches("[0-9]+"))
                .mapToInt(Integer::parseInt)
                .max();

        return maxIn;
    }
}

//                .filter(s -> !s.isEmpty())
