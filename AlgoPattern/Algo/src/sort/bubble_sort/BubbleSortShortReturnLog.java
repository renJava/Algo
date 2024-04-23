package sort.bubble_sort;

import java.util.logging.Logger;

public class BubbleSortShortReturnLog {

    private static final Logger logger = Logger.getLogger(BubbleSortShortReturnLog.class.getName());

    public static int[] sort(int[] arrayCalled) {
        int n = arrayCalled.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayCalled[j] > arrayCalled[j + 1]) {
                    int temp = arrayCalled[j];
                    arrayCalled[j] = arrayCalled[j + 1];
                    arrayCalled[j + 1] = temp;
                }
            }
        }

        return arrayCalled;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        int[] sortedArray = sort(array);

        for (int j : sortedArray) {
            logger.info(String.valueOf(j));
        }
    }
}