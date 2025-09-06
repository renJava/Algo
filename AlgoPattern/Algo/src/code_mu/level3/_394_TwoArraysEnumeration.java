package code_mu.level3;
/**
 * Уровень 3.9 задачника Java
 * № 39.4
 Даны два массива:
 int[] arr1 = {1, 2, 3};
 int[] arr2 = {4, 5, 6};
 Переберите эти массивы одним циклом и в каждой итерации выводите их элементы следующим образом:
 "1,4"
 "2,5"
 "3,6"
 */
public class _394_TwoArraysEnumeration {
    public static void main (String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("\"" + arr1[i] + "," + arr2[i] + "\"");
        }
    }
}
