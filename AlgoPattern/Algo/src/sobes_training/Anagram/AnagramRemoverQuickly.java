package sobes_training.Anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AnagramRemoverQuickly {
    public static void main(String[] args) {
        // Создаем список слов, из которых нужно удалить анаграммы
        List<String> words = Arrays.asList("cat", "act", "dog", "god", "tac", "rat");

        // Вызываем метод удаления анаграмм и сохраняем результат в переменной result
        List<String> result = removeAnagramsQuickly(words);

        // Выводим результат на консоль
        System.out.println(result); // [cat, dog, rat]
    }

    /**
     * Метод удаления анаграмм из списка слов.
     * @param words список слов, из которых нужно удалить анаграммы
     * @return список слов без анаграмм
     */
    public static List<String> removeAnagramsQuickly(List<String> words) {
        // Создаем хеш-таблицу для хранения анаграмм
        Map<String, String> anagrams = new HashMap<>();

        // Проходим по списку слов
        for (String word : words) {
            // Преобразуем слово в массив символов
            char[] letters = word.toCharArray();

            // Сортируем массив символов с помощью counting sort
            char[] sortedLetters = countingSort(letters);

            // Преобразуем отсортированный массив символов обратно в строку
            String sortedWord = new String(sortedLetters);

            // Проверяем, есть ли уже отсортированная строка в хеш-таблице
            if (anagrams.containsKey(sortedWord)) {
                // Если да, то помечаем ее как анаграмму, присваивая значение null
                anagrams.put(sortedWord, null);
            } else {
                // Если нет, то добавляем ее в хеш-таблицу с соответствующим словом
                anagrams.put(sortedWord, word);
            }
        }

        // Собираем все значения из хеш-таблицы, которые не являются анаграммами
        return anagrams.values().stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    /**
     * Метод сортировки массива символов с помощью counting sort.
     * @param letters массив символов для сортировки
     * @return отсортированный массив символов
     */
    public static char[] countingSort(char[] letters) {
        // Создаем массив для хранения количества каждого символа
        int[] counts = new int[256]; // 256 - количество возможных значений ASCII

        // Считаем количество каждого символа
        for (char letter : letters) {
            counts[letter]++;
        }

        // Создаем отсортированный массив символов
        char[] sortedLetters = new char[letters.length];

        // Заполняем отсортированный массив символов
        int index = 0;
        for (int i = 0; i < 256; i++) {
            while (counts[i]-- > 0) {
                sortedLetters[index++] = (char) i;
            }
        }

        return sortedLetters;
    }
}