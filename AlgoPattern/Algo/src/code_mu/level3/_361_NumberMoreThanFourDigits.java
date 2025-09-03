package code_mu.level3;

/**
 * Уровень 3.6 задачника Java
 * № 36.1
 * <p>
 * Дан массив с целыми числами. Выведите в консоль числа, состоящие более чем из трех цифр.
 */

public class _361_NumberMoreThanFourDigits {

    public static void main(String[] args) {
        int[] arr = {1245, 215, 2614, -278, 2, 1224, 10000, -12345, 234, 186, 128};

        for (int j : arr) {
            System.out.print(Math.abs(j) > 999 ? j + " " : "");
        }
    }
//        String[] arrStr = new String[arr.length];

/*
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = Integer.toString(Math.abs(arr[i]));
            if (arrStr[i].length() > 3) System.out.println(arrStr[i]);
            }
        }
*/
    }

