package binary_trees;

public class BinarySearchLoop {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // Возвращаем индекс элемента, если он найден
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;  // Если элемент не найден, возвращаем -1
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 7, 9};
        int targetElement = 7;

        int result = binarySearch(sortedArray, targetElement);
        if (result != -1) {
            System.out.println("Элемент " + targetElement + " найден в индексе " + result);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}