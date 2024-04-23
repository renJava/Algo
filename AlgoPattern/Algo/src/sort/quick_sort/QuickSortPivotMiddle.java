package sort.quick_sort;

public class QuickSortPivotMiddle {
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 5, 6, 4, 8 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Отсортированный массив: ");
        printArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Выбор опорного элемента из центра массива
            int mid = low + (high - low) / 2;
            int pivot = arr[mid];

            // Разделение массива на подмассивы
            int partitionIndex = partition(arr, low, high, pivot);

            // Рекурсивно сортируем левую и правую части
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        int i = low;
        int j = high;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
