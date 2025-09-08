package code_mu.level3;

/**
 Дано дробное число:

 float num = 12.34;
 Запишите целую часть числа в одну переменную, а дробную часть - в другую:

 int num1 = 12;
 int num1 = 34;
 */

public class _3103_VariableSplitting {
    public static void main(String[] args) {
        float num = 12.34f;
        int num1 = (int) num;
        int num2 = (int) (num * 100) % 100;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
