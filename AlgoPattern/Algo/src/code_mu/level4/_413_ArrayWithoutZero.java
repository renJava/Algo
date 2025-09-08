package code_mu.level4;

/**
 * Дан массив:
 * int[] {1, 0, 2, 3, 0, 5}
 * <p>
 * Удалите из массива все нули и запишите результат в новый массив:
 * int[] {1, 2, 3, 5}
 */

public class _413_ArrayWithoutZero {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 3, 0, 5};
        int[] arr2 = removeZeros(arr1);

        // Выводим новый массив
        System.out.print("arr2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }

    // Метод для удаления нулей из массива
    public static int[] removeZeros(int[] arr) {
        // Сначала подсчитываем количество ненулевых элементов
        int count = 0;
        for (int num : arr) {
            if (num != 0) {
                count++;
            }
        }

        // Создаем новый массив нужного размера
        int[] result = new int[count];
        int index = 0;

        // Заполняем новый массив ненулевыми элементами
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
