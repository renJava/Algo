package maxStack;

import java.util.Stack;

public class StackMax {
    private final Stack<Number> stack;       // основной стек
    private final Stack<Double> stackMax;    // стек для хранения максимальных значений

    public StackMax() {
        stack = new Stack<>();
        stackMax = new Stack<>();
    }

    // Метод добавления элемента в стек
    public void push(Number value) {
        stack.push(value);
        // Обновление максимального значения
        double val = value.doubleValue();
        if (stackMax.isEmpty() || val >= stackMax.peek()) {
            stackMax.push(val);
        }
    }

    // Метод удаления элемента из стека
    public Number pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Number value = stack.pop();
        // Обновление максимального значения
        if (value.doubleValue() == stackMax.peek()) {
            stackMax.pop();
        }
        return value;
    }

    // Метод для получения максимального элемента
    public Double peekMax() {
        if (stackMax.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackMax.peek();
    }

    // Проверка, пустой ли стек
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackMax stackMax = new StackMax();
        stackMax.push(5);      // Integer
        stackMax.push(1.5);    // Double
        stackMax.push(3.3f);   // Float
        stackMax.push(7.0);    // Double

        System.out.println("Max: " + stackMax.peekMax()); // Max: 7.0
        stackMax.pop();
        System.out.println("Max: " + stackMax.peekMax()); // Max: 5
    }
}