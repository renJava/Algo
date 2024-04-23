package fundamental;

class EmailSender {
    public void sendEmail(String recipient, String message) {
        System.out.println("Отправка электронной почты на " + recipient + ": " + message);
    }
}

class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
}

class UserValidator {
    public boolean validateUser(User user) {
        // Логика валидации пользователя (здесь просто возвращаем true для демонстрации)
        return true;
    }
}

class UserManager {
    private EmailSender emailSender;
    private UserValidator userValidator;

    public UserManager(EmailSender emailSender, UserValidator userValidator) {
        this.emailSender = emailSender;
        this.userValidator = userValidator;
    }

    public void registerUser(User user) {
        if (userValidator.validateUser(user)) {
            emailSender.sendEmail(user.getEmail(), "Регистрация прошла успешно");
        }
    }
}

public class FunctionalDesign {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        UserValidator userValidator = new UserValidator();
        UserManager userManager = new UserManager(emailSender, userValidator);

        User newUser = new User("John", "john@example.com", "password");

        userManager.registerUser(newUser);
    }
}