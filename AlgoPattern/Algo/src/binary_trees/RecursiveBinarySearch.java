package binary_trees;

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // Возвращаем индекс элемента, если он найден
            }

            if (arr[mid] < target) {
                return recursiveBinarySearch(arr, target, mid + 1, right);
            } else {
                return recursiveBinarySearch(arr, target, left, mid - 1);
            }
        }

        return -1;  // Если элемент не найден, возвращаем -1
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 7, 9};
        int targetElement = 7;

        int result = recursiveBinarySearch(sortedArray, targetElement, 0, sortedArray.length - 1);
        if (result != -1) {
            System.out.println("Элемент " + targetElement + " найден в индексе " + result);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}