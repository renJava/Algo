package code_mu.level1;

/**
 * ������� 14 ��������� Java
 * � 141
 * <p>
 * �������� � ������� ��� ������ ����� �� ���������� �� 1 �� 100.
 */

public class _141_1_100_OnlyEven {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i);
            if (i % 10 == 0) {
                // ���� ��� 100, ������ �����, ����� �������
                System.out.println(i != 100 ? "," : ".");
            } else {
                System.out.print(", "); // ������� ����� ��������� �����
            }
        }
    }
    }
