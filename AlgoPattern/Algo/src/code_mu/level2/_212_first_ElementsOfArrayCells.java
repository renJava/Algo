package code_mu.level2;

/**
 * Уровень 2.1 задачника Java
 * № 21.2
 * <p>
 * Дан массив со строками:
 * <p>
 * String[] arr = {"ab", "cd", "ef"};
 * Выведите в консоль первые символы элементов этого массива.
 */

public class _212_first_ElementsOfArrayCells {
    public static void main(String[] args) {
        String[] arr = {"ab", "cd", "ef"};
        System.out.print("\nПервые символы элементов этого массива: ");

        for (String s : arr) {
            System.out.print(s.charAt(0));
        }
    }
}
