package sobes_training.person_unique;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PersonsTest {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Ivan", "Vasya", "Petr"));
        persons.add(new Person(2, "Ivan", "Vasya", "Petr"));
        persons.add(new Person(3, "Ivan", "Vasya", "Petr"));
        persons.add(new Person(4, "Ivan", "Gupta", "Ivan"));
        persons.add(new Person(5, "Petr", "Rama", "Igor"));

        Collection<String> uniqueNames = uniqueFullNames(persons);

        // Выводим уникальные ФИО
        uniqueNames.forEach(System.out::println);
    }

    // Метод для поOptionalлучения уникальных ФИО в формате "Фамилия Имя Отчество"
    public static Collection<String> uniqueFullNames(List<Person> persons) {
        return persons.stream()
                .map(person -> person.firstName + " " + person.secondName + " " + person.patronymicName) // Формируем строку ФИО
                .collect(Collectors.toSet()); // Используем Set для автоматического удаления дубликатов
    }
}





