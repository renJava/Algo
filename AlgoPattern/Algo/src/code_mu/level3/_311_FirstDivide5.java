package code_mu.level3;

/**
 * Уровень 3.1 задачника Java
 * № 31.1
 * <p>
 * Дан массив с целыми числами от 1 до 100.
 * Выведите в консоль только те числа, которые делятся на 5.
 */

public class _311_FirstDivide5 {
    public static void main(String[] args) {
        int[] sourceArray = new int[100];
        for (int i = 1; i <= 100; i++) {    // заполняем массив числами
            sourceArray[i - 1] = i;
        }
        for (int i : sourceArray) {    // выводим только те числа, которые делятся на 5
            if (i % 5 == 0) System.out.print(i + " ");
        }
    }
}
