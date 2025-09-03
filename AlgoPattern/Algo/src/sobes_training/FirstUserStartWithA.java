package sobes_training;
/**
 * Написать метод findUser(), который возвращает первого пользователя с username начинающегося с А
 */

import java.util.ArrayList;
import java.util.List;

public class FirstUserStartWithA {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();  // Создаем новый список пользователей
        userList.add(new User("Alice"));
        userList.add(new User("Bob"));
        userList.add(new User("Anna"));
        userList.add(new User("David"));

        String result = findUser(userList);
        System.out.println(result);
    }

    // Метод для поиска первого пользователя, имя которого начинается с "A"
    private static String findUser(List<User> userList) {
        List<User> usersStartWithA = new ArrayList<>();
        for (User user : userList) {
            if (user.username().toLowerCase().startsWith("a")) {
                usersStartWithA.add(user);
            }
        }

        if (usersStartWithA.isEmpty()) {
            return "Пользователь не найден";
        }
        return usersStartWithA.get(0).username();
        // Логика поиска
    }

    record User(String username) {
    }
}
