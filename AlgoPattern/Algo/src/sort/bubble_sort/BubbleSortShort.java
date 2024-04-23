package sort.bubble_sort;

import java.util.Arrays;

public class BubbleSortShort {

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3}; // Создаем массив с элементами 5, 2, 4, 6, 1, 3
        System.out.println("\nИсходный массив: " + Arrays.toString(array));
        int n = array.length; // Получаем длину массива

        for (int i = 0; i < n - 1; i++) { // Цикл `for` для итерации по всем элементам массива
            for (int j = 0; j < n - i - 1; j++) { // Цикл `for` для итерации по всем элементам массива, начиная с индекса 0 и заканчивая индексом `n - i - 1`
                if (array[j] > array[j + 1]) { // Если текущий элемент больше следующего элемента, меняем их местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("\nКонечный массив: [");
        for (int j : array) { // Выводим все элементы массива на консоль
            if (j == n) {
                System.out.print(j);
                break;
            }
            System.out.print(j + ", ");
        }
        System.out.println("]");
    }

}
