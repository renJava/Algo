package sobes_training;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionTransformations {
    public static void main(String[] args) {
        // Исходная коллекция строк
        List<String> list1 = List.of("1", "2", "3");

        // Преобразуем коллекцию строк в коллекцию целых чисел
        List<Integer> integers = change(list1, Integer::parseInt);

        // Выводим результат
        integers.forEach(System.out::println);
    }

    // Универсальный метод преобразования коллекции
    public static <T, R> List<R> change(List<T> collection, Function<T, R> func) {
        // Используем Stream API для преобразования
        return collection.stream()
                .map(func) // Применяем функцию преобразования
                .collect(Collectors.toList()); // Собираем результат в новый список
    }
}