package sort.bubble_sort;

public class BubbleSortLong {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 9};

        System.out.println("\nИсходный массив:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nОтсортированный массив:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем элементы местами
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Если во внутреннем цикле не было обменов, значит массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}