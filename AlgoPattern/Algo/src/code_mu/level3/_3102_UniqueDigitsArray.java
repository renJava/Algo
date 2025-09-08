package code_mu.level3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Дан массив с целыми числами:
 * int arr1[] = {123, 334, 456, 556, 789};
 * Запишите в новый массив числа, состоящие из разных цифр:
 * int arr2[] = {123, 456, 789};
 */

public class _3102_UniqueDigitsArray {
    public static void main(String[] args) {
        int[] arr1 = {123, 334, 456, 556, 789, 321, 654, 556};
        int[] arr2 = getUniqueDigitNumbers(arr1);

        // Выводим новый массив
        System.out.print("arr2: ");
        for (int num : arr2) {System.out.print(num + " ");}
    }

    // Метод для получения массива с уникальными цифрами
    public static int[] getUniqueDigitNumbers(int[] arr) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (int num : arr) {
            if (hasUniqueDigits(num)) {
                uniqueNumbers.add(num);
            }
        }

        // Преобразуем ArrayList в массив
        return uniqueNumbers.stream().mapToInt(i -> i).toArray();
    }

    // Метод для проверки уникальности цифр в числе
    public static boolean hasUniqueDigits(int num) {
        HashSet<Character> digits = new HashSet<>();
        String numStr = Integer.toString(num);

        for (char digit : numStr.toCharArray()) {
            if (!digits.add(digit)) {
                return false; // Если цифра уже есть, значит они не уникальны
            }
        }
        return true; // Все цифры уникальны
    }
}
/*
Объяснение кода
Использование HashSet:

HashSet используется для проверки уникальности цифр в числе, что позволяет избежать дублирования.
Сохранение порядка:

Используем ArrayList для хранения чисел с уникальными цифрами, что сохраняет порядок добавления. И не массив,
чтобы не заморачиваться с расчётом его размера.

Преобразование в массив:
В конце ArrayList преобразуется в массив с помощью stream().
С помощью этого кода мы получим новый массив, который будет содержать только числа с уникальными цифрами,
в том же порядке, в котором они были в исходном массиве.
*/