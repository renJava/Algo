package sobes_training;
/**
 * Реализовать класс IteratorBoth, который перебирает элементы из двух наборов данных. Он должен последовательно
 * перебирать элементы из первого Iterable, а затем, когда он закончится, переключиться на второй Iterable
 */

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorBothMain {
    public static void main(String[] args) {
        var iterableBoth = new IterableBoth<>(Set.of(1, 4, 2), List.of(10, 16, 11, 12, 12, 14, 16));
        iterableBoth.forEach(System.out::println);
    }

    private static class IteratorBoth<T> implements Iterator<T> {
        private final Iterator<T> iterator1;
        private final Iterator<T> iterator2;
        private boolean isFirstIteratorFinished = false;

        // Конструктор принимает два итератора
        public IteratorBoth(Iterator<T> iterator1, Iterator<T> iterator2) {
            this.iterator1 = iterator1;
            this.iterator2 = iterator2;
        }

        @Override
        public boolean hasNext() {
            // Если первый итератор ещё не закончен, проверяем его
            if (!isFirstIteratorFinished) {
                if (iterator1.hasNext()) {
                    return true;
                } else {
                    // Если первый итератор закончился, переключаемся на второй
                    isFirstIteratorFinished = true;
                }
            }
            // Проверяем второй итератор
            return iterator2.hasNext();
        }

        @Override
        public T next() {
            // Если первый итератор ещё не закончен, возвращаем его следующий элемент
            if (!isFirstIteratorFinished) {
                if (iterator1.hasNext()) {
                    return iterator1.next();
                } else {
                    // Переключаемся на второй итератор
                    isFirstIteratorFinished = true;
                }
            }
            // Возвращаем следующий элемент из второго итератора
            return iterator2.next();
        }
    }

    private static class IterableBoth<T> implements Iterable<T> {
        private final Iterable<T> iterable1;
        private final Iterable<T> iterable2;

        // Конструктор принимает два Iterable
        public IterableBoth(Iterable<T> iterable1, Iterable<T> iterable2) {
            this.iterable1 = iterable1;
            this.iterable2 = iterable2;
        }

        @Override
        public Iterator<T> iterator() {
            return new IteratorBoth<>(iterable1.iterator(), iterable2.iterator());
            // начиная с Java 7 тип <> выводится автоматически
        }
    }
}