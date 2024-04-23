package sort.merge_sort;

public class MergeSortLoop {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 9};

        System.out.println("Исходный массив:");
        printArray(array);

        mergeSort(array);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    public static void mergeSort(int[] array) {
        int n = array.length;
        int[] tempArray = new int[n];
        int blockSize = 1;

        // Цикл для разделения массива на блоки и последующего слияния отсортированных блоков
        while (blockSize < n) {
            int leftStart = 0;

            // Цикл для слияния блоков
            while (leftStart < n - blockSize) {
                int mid = leftStart + blockSize - 1;
                int rightEnd = Math.min(leftStart + 2 * blockSize - 1, n - 1);
                merge(array, tempArray, leftStart, mid, rightEnd);
                leftStart += 2 * blockSize;
            }

            blockSize *= 2;
        }
    }

    public static void merge(int[] array, int[] tempArray, int leftStart, int mid, int rightEnd) {
        int leftEnd = mid;
        int rightStart = mid + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        // Слияние двух отсортированных подмассивов во временный массив
        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                tempArray[index] = array[left];
                left++;
            } else {
                tempArray[index] = array[right];
                right++;
            }
            index++;
        }

        // Копирование оставшихся элементов из левого подмассива, если они есть
        System.arraycopy(array, left, tempArray, index, leftEnd - left + 1);

        // Копирование оставшихся элементов из правого подмассива, если они есть
        System.arraycopy(array, right, tempArray, index, rightEnd - right + 1);

        // Копирование временного массива в исходный массив
        System.arraycopy(tempArray, leftStart, array, leftStart, size);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}