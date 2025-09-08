package code_mu.level4;

/**
 Дано целое число:

 int num = 12345;
 Поменяйте местами первую и последнюю цифру этого числа:

 int 52341
 */
public class _425_ChangeDigitsInNumber {
    public static void main(String[] args) {
        int num = 52341;
        String toString = String.valueOf(num); // Преобразуем число в строку
        String first = toString.substring(0, 1); // Получаем первую цифру
        int numLen = toString.length();
        String last = toString.substring(numLen - 1, numLen); // Получаем последнюю цифру

        System.out.println(last + toString.substring(1, numLen - 1) + first);
    }
}
