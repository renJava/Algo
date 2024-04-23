package fundamental.properties_container;

public class Main {
    public static void main(String[] args) {
        PropertiesContainer container = new PropertiesContainer();

        container.setProperty("username", "john");
        container.setProperty("password", "secret");

        String username = container.getProperty("username");
        String password = container.getProperty("password");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        container.removeProperty("password");

        boolean containsPassword = container.containsProperty("password");
        System.out.println("Contains password: " + containsPassword);
    }
}