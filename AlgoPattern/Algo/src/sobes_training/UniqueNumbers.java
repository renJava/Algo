package sobes_training;

/**
 * дан исходный массив чисел, необходимо:
 * Создать результирующий массив с уникальными числами и создать массив чисел которые
 * не попали в результирующий массив
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 2, 3, 5, 1, 6}; // Исходный массив

        // Выводим результаты
        System.out.println("Исходные числа:");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Создаем HashSet для хранения уникальных чисел
        HashSet<Integer> uniqueSet = new HashSet<>();
        // Список для хранения дубликатов
        List<Integer> duplicates = new ArrayList<>();

        for (int num : inputArray) {
            // Если число уже есть в наборе, добавляем его в список дубликатов
            if (!uniqueSet.add(num)) {
                duplicates.add(num);
            }
        }

        // Преобразуем HashSet в массив уникальных чисел
        int[] uniqueArray = uniqueSet.stream().mapToInt(Integer::intValue).toArray();
        // Преобразуем список дубликатов в массив
        int[] duplicatesArray = duplicates.stream().mapToInt(Integer::intValue).toArray();

        // Выводим результаты
        System.out.println("Уникальные числа:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\nЧисла, которые не попали в результирующий массив:");
        for (int num : duplicatesArray) {
            System.out.print(num + " ");
        }
    }
}