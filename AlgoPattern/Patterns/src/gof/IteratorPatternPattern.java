package gof;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// Шаг 1) Определение интерфейса Итератора:
interface Iterator<T> {
    boolean hasNext();
    T next();
}

// Шаг 2) Определение интерфейса Коллекции:
interface Collection<T> {
    Iterator<T> createIterator();
    void add(T element); // Add this line to define the 'add' method
}
// Шаг 3) Реализация конкретного Итератора:
class ListIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int position;

    public ListIterator(List<T> list) {
        this.list = list;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < list.size();
    }

    public T next() {
        if (hasNext()) {
            T element = list.get(position);
            position++;
            return element;
        }
        throw new NoSuchElementException();
    }
}

// Шаг 4) Реализация конкретной Коллекции:
class MyList<T> implements Collection<T> {
    private final List<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public Iterator<T> createIterator() {
        return new ListIterator<>(list);
    }
}

// Шаг 5) Использование паттерна Итератор:
class IteratorPattern {
    public static void main(String[] args) {
        Collection<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        Iterator<Integer> iterator = myList.createIterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}