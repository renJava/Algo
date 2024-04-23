package search;
public class LinearSearch {

    // Метод для линейного поиска
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Возвращаем индекс элемента, если он найден
            }
        }

        return -1; // Возвращаем -1, если элемент не найден
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        int target = 8;

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Элемент найден на позиции: " + index);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}