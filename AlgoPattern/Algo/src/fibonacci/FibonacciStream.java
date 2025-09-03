package fibonacci;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        // Создаем бесконечный поток массивов BigDecimal, представляющих числа Фибоначчи
        Stream<BigDecimal[]> fibonacciStream = Stream.iterate(new BigDecimal[]{BigDecimal.ZERO, BigDecimal.ONE},
                t -> new BigDecimal[]{t[1], t[0].add(t[1])});

        // Ограничиваем количество элементов в стриме до 10,000
        fibonacciStream
                .limit(10000)
                // Выводим первый элемент каждого элемента в стриме
                .forEach(t -> {
                    System.out.println(t[0]); // Выводим текущее число Фибоначчи
                    System.out.println();      // Печатаем пустую строку
                });
    }
}