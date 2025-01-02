package sobes_training;
/**
 * Написать алгоритм для генерации последовательности случайных неповторяющихся чисел от 1 до 1000 с использованием
 * функции random(N), возвращающей случайное число в диапазоне от 1 до N, и без использования оператора if
 */

import java.util.HashSet;
import java.util.Random;

public class RandomWithHashSet {
    public static void main(String[] args) {
        int N = 1000; // Генерация чисел от 1 до 1000
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();

        // Заполняем HashSet случайными числами
        while (uniqueNumbers.size() < N) {
            uniqueNumbers.add(random.nextInt(N) + 1);
        }

        // Выводим всю последовательность
        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }
    }
}

