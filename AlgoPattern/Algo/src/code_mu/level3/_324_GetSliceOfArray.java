package code_mu.level3;

import java.util.Arrays;

/**
 * Уровень 3.2 задачника Java
 * № 32.4
 * <p>
 * Дан массив:
 * <p>
 * int[] [1, 2, 3, 4, 5, 6]
 * Получите из него следующий срез:
 * <p>
 * int[] [3, 4, 5]
 */

public class _324_GetSliceOfArray {

    public static void main(String[] args) {


        int[] originIntArray = {1, 2, 3, 4, 5, 6};
        int[] resultIntArray = new int[3];
        System.out.println("Результирующий срез: "
                + makeResultArray(originIntArray, resultIntArray, 2));
    }

    public static String makeResultArray(int[] fromOriginArray, int[] toResultArray, int fromPosInOrigin) {
        int resultLengthMaker = toResultArray.length;
        System.arraycopy(fromOriginArray, fromPosInOrigin, toResultArray,
                0, resultLengthMaker);
        return Arrays.toString(toResultArray);
    }

}
/*
        int[] originArray = new int[6];
        int[] resultArray = new  int[3];

        System.arraycopy(originArray, 2, resultArray, 0, 3);

        System.out.println("Результирующий срез" + Arrays.toString(resultArray));

 */