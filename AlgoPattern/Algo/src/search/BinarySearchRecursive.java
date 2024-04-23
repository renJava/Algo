package search;

public class BinarySearchRecursive {
    // Рекурсивный бинарный поиск
    public static int recursiveBinarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // Возвращаем индекс элемента, если он найден
            }

            if (arr[mid] < target) {
                return recursiveBinarySearch(arr, target, mid + 1, right); // Рекурсивный вызов для правой половины массива
            } else {
                return recursiveBinarySearch(arr, target, left, mid - 1); // Рекурсивный вызов для левой половины массива
            }
        }

        return -1;  // Если элемент не найден, возвращаем -1
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 7, 9};
        int targetElement = 7;

        int result = recursiveBinarySearch(sortedArray, targetElement, 0, sortedArray.length - 1);
        if (result != -1) {
            System.out.println("Элемент " + targetElement + " найден в позиции массива " + result);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
