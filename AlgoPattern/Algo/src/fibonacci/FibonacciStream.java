package fibonacci;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        Stream<BigDecimal[]> fibonacciStream = Stream.iterate(new BigDecimal[]{BigDecimal.ZERO, BigDecimal.ONE},
                t -> new BigDecimal[]{t[1], t[0].add(t[1])});

        fibonacciStream
                .limit(10000) // Ограничиваем количество элементов в стриме до 10к
                .forEach(t -> System.out.println(t[0])); // Выводим первый элемент каждого элемента в стриме
    }
}