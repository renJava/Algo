package code_mu.level3;

/**
 * Уровень 3.7 задачника Java
 * № 37.4
 * <p>
 * Даны целые числа, разделенные запятыми:
 * <p>
 * String str = "12,34,56";
 * Найдите сумму этих чисел.
 */

public class _374_SumSplitInt {
    public static void main(String[] args) {
        String str = "12,34,56";
        System.out.println("Сумма чисел: " + sumSplitInt(str));
    }

    public static int sumSplitInt(String str) {

        String[] arr = str.split(","); // Разделение строки на массив по запятой
        int sum = 0; // Сумма чисел
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        return sum;

/*
        for (String s : arr) {
            sum += Integer.getInteger(s);
        }
        return sum;
*/

/*
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }
*/
    }

}
