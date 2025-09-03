package sobes_training.equals_hashcode;

/**
 * Написать equals и hashcode для класса Operator
 */

import java.util.List;
import java.util.Objects;

public class Operator {
    private String id; // Уникальный идентификатор оператора
    private String fio; // ФИО оператора
    private List<Branch> branches; // Список отделений, связанных с оператором

    // Реализация метода equals
    @Override
    public boolean equals(Object o) {
        // 1. Проверяем, если объект сравнивается сам с собой — возвращаем true
        if (this == o) return true;

        // 2. Проверяем, что объект не null и относится к тому же классу
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Приводим объект к типу Operator для дальнейшего сравнения
        Operator operator = (Operator) o;

        // 4. Сравниваем поля id, fio и branches. Используем Objects.equals
        // для корректной обработки null-значений
        return Objects.equals(id, operator.id) &&
                Objects.equals(fio, operator.fio) &&
                Objects.equals(branches, operator.branches);
    }

    // Реализация метода hashCode
    @Override
    public int hashCode() {
        // 1. Используем Objects.hash, чтобы сгенерировать hash-код на основе
        // полей id, fio и branches. Это обеспечивает совместимость с equals.
        return Objects.hash(id, fio, branches);
    }
}
