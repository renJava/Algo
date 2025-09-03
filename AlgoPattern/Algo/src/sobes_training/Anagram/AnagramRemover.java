package sobes_training.Anagram;
/**
 * Дан лист со строками
 * List<String> words = Arrays.asList("cat", "act", "dog", "god", "tac", "rat");
 *
 * Нужно написать метод, который будет оттуда удалять анаграммы
 *
 * Придумай красивый, компактный и быстрый вариант решения
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AnagramRemover {

    public static void main(String[] args) {
        // Создаем список слов, из которых нужно удалить анаграммы
        List<String> words = Arrays.asList("cat", "act", "dog", "god", "tac", "rat");

        // Вызываем метод удаления анаграмм и сохраняем результат в переменной result
        List<String> result = removeAnagrams(words);

        // Выводим результат на консоль
        System.out.println(result); // [cat, dog, rat]
    }

    /**
     * Метод удаления анаграмм из списка слов.
     * @param words список слов, из которых нужно удалить анаграммы
     * @return список слов без анаграмм
     */
    public static List<String> removeAnagrams(List<String> words) {
        // Создаем хеш-таблицу для хранения анаграмм
        Map<String, String> anagrams = new HashMap<>();

        // Проходим по списку слов
        for (String word : words) {
            // Преобразуем слово в массив символов
            char[] letters = word.toCharArray();

            // Сортируем массив символов
            Arrays.sort(letters);

            // Преобразуем отсортированный массив символов обратно в строку
            String sorted = new String(letters);

            // Проверяем, есть ли уже отсортированная строка в хеш-таблице
            if (anagrams.containsKey(sorted)) {
                // Если да, то помечаем ее как анаграмму, присваивая значение null
                anagrams.put(sorted, null);
            } else {
                // Если нет, то добавляем ее в хеш-таблицу с соответствующим словом
                anagrams.put(sorted, word);
            }
        }

        // Собираем все значения из хеш-таблицы, которые не являются анаграммами
        return anagrams.values().stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
