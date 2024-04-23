package prepaire_hibernate;// Импорт необходимых библиотек


//import java.lang.module.*;

import java.lang.module.Configuration;

public class ConnectPostgreSQLJDBC {
    public static void main(String[] args) {

        // Настройки Hibernate
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.driver_class",
                "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.url",
                "jdbc:postgresql://localhost:5432/testdb");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "password");

        configuration.addAnnotatedClass(User.class);

        SessionFactory sessionFactory =
                configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        // Работа с сессией
        session.beginTransaction();

        // Запросы к БД и обработка результатов

        session.getTransaction().commit();
        session.close();
    }
}