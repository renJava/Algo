package sort.quick_sort;

public class QuickSortPivotLast {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Отсортированный массив: ");
        printArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Разделение массива на подмассивы
            int partitionIndex = partition(arr, low, high);

            // Рекурсивно сортируем левую и правую части
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Выбор опорного элемента (в данном случае, последний элемент массива)
        int pivot = arr[high];
        int i = low - 1;

        // Перестановка элементов меньше опорного слева от него
        // и элементов больше опорного справа от него
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Перестановка опорного элемента в правильную позицию
        swap(arr, i + 1, high);

        return i + 1;
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