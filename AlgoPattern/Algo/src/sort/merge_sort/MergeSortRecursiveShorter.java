package sort.merge_sort;

public class MergeSortRecursiveShorter {public static void mergeSort(int[] array) {
    int n = array.length;
    int[] tempArray = new int[n];

    for (int size = 1; size < n; size *= 2) {
        for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * size) {
            int mid = Math.min(leftStart + size - 1, n - 1);
            int rightEnd = Math.min(leftStart + 2 * size - 1, n - 1);

            merge(array, tempArray, leftStart, mid, rightEnd);
        }
    }
}

    public static void merge(int[] array, int[] tempArray, int leftStart, int mid, int rightEnd) {
        int leftEnd = mid;
        int rightStart = mid + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

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

        System.arraycopy(array, left, tempArray, index, leftEnd - left + 1);
        System.arraycopy(array, right, tempArray, index, rightEnd - right + 1);
        System.arraycopy(tempArray, leftStart, array, leftStart, size);
    }
}