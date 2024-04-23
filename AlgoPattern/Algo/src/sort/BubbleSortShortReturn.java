package sort;

public class BubbleSortShortReturn {

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
        for (int j : array) {
            System.out.print(j + " ");
        }
        int[] sortedArray = sort(array);

        System.out.println();
        for (int j : sortedArray) {
            System.out.print(j + " ");
        }
    }
}
