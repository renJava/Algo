package sobes_training;

import java.util.ArrayList;
import java.util.List;

public class AllUsersStartWithA {
    public static void main(String[] args) {
        // Создаем список пользователей и добавляем несколько объектов User
        List<User> userList = new ArrayList<>();
        userList.add(new User("Alice"));
        userList.add(new User("Bob"));
        userList.add(new User("Anna"));
        userList.add(new User("Charlie"));
        userList.add(new User("Alex"));

        // Находим всех пользователей, имена которых начинаются с "A"
        List<User> results = findAll(userList);

        // Проверяем результат и выводим имена найденных пользователей
        if (!results.isEmpty()) {
            System.out.println("Пользователи, начинающиеся с 'A':");
            for (User user : results) {
                System.out.println(user.getUsername());
            }
        } else {
            System.out.println("Пользователи не найдены");
        }
    }

    // Метод для поиска всех пользователей, имена которых начинаются с "A"
    private static List<User> findAll(List<User> userList) {
        List<User> foundUsers = new ArrayList<>(); // Список для хранения найденных пользователей
        for (User user : userList) {
            // Проверяем, начинается ли имя пользователя с "A"
            if (user.getUsername().startsWith("A")) {
                foundUsers.add(user); // Добавляем найденного пользователя в список
            }
        }
        return foundUsers; // Возвращаем список найденных пользователей
    }

    // Внутренний класс User
    static class User {
        private final String username;

        // Конструктор User
        public User(String username) {
            this.username = username;
        }

        // Метод для получения имени пользователя
        public String getUsername() {
            return username;
        }
    }
}