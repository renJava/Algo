interface BigInt {
    BigInt incrementAndGet();
}

class MyBigIntImpl implements BigInt {
    // Массив для хранения цифр большого целого числа
    private char[] digits;
    // Длина действительной части числа
    private int length;

    public MyBigIntImpl(String value) {
        // Инициализируем массив цифр и длину числа
        this.digits = value.toCharArray();
        this.length = this.digits.length;
    }

    @Override
    public BigInt incrementAndGet() {
        // Начинаем с единицы для увеличения
        int carry = 1;
        // Проходим по цифрам числа от конца к началу
        for (int i = this.length - 1; i >= 0; i--) {
            // Получаем текущую цифру
            int digit = this.digits[i] - '0';
            // Увеличиваем ее на единицу
            digit += carry;
            // Если цифра меньше 10, записываем ее и обнуляем перенос
            if (digit < 10) {
                this.digits[i] = (char) (digit + '0');
                carry = 0;
                break;
            }
            // Иначе обнуляем текущую цифру и продолжаем с переносом
            else {
                this.digits[i] = '0';
            }
        }
        // Если остался перенос, добавляем новую старшую цифру "1"
        if (carry == 1) {
            this.length++;
            char[] newDigits = new char[this.length];
            newDigits[0] = '1';
            System.arraycopy(this.digits, 0, newDigits, 1, this.length - 1);
            this.digits = newDigits;
        }
        return this;
    }

    @Override
    public String toString() {
        // Преобразуем массив цифр в строку
        return new String(this.digits, 0, this.length);
    }
}

public class JohnLive1 {
    public static void main(String[] args) {
        var bigInt = new MyBigIntImpl("-8589934592");
        System.out.println(bigInt.incrementAndGet()); // 8589934593
    }
}