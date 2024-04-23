package prepaire_hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMySQL_JDBC {
    public static void main(String[] args) {

        // Устанавливаем класс драйвера для MySQL
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Драйвер MySQL не найден");
            return;
        }

        // Настраиваем параметры подключения
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement()) {

            // Выполнение SQL запроса
            String sql = "SELECT * FROM users";
            ResultSet result = stmt.executeQuery(sql);

            // Обработка результатов
            while (result.next()) {
                System.out.println(result.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}