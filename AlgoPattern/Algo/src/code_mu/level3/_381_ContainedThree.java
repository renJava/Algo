package code_mu.level3;

/**
 * Уровень 3.8 задачника Java
 * № 38.1
 * <p>
 * Дан массив с целыми числами. Проверьте, что все числа из этого массива содержат в себе цифру 3.
 */

public class _381_ContainedThree {
    public static void main(String[] args) {
        int[] dividedBy3Int = {238, 293, 233, 311, 386};
        System.out.println("Цифра 3 встречается во всех элементах массива: "
                + allElementsContainThree(dividedBy3Int));
    }

    private static String allElementsContainThree(int[] dividedBy3Int) {
        for (int i : dividedBy3Int) {
            if (!String.valueOf(i).contains("3")) return "Нет";
        }
        return "Да";
    }
}
