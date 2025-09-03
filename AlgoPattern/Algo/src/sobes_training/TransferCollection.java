package sobes_training;
/**
 * Реализовать универсальный метод преобразования коллекции объектов одного типа в коллекцию другого типа,
 * (например коллекцию String преобразовать в коллекцию Integer). Метод должен принимать коллекцию и функцию
 * преобразования одного типа в другой.
 */

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransferCollection {
    public static void main (String[] args) {
        List<String> list1 = List.of("1", "2", "3");
        List<Integer> integers = transfer(list1, Integer::parseInt);
        integers.forEach(System.out::println);
        }

    public static <T, R> List<R> transfer(List<T> collection, Function<T, R> transfer) {
        return collection.stream()
                .map(transfer)
                .collect(Collectors.toList());
    }}