import java.util.function.Predicate;
import java.util.stream.Stream;

public class NameCounter {

    public static void main(String[] args) {
        String[] names = {"Java", "Kotlin", "Java"};

        String name = "Java";
        Predicate<String> predicate = name::equals;

        long count1 = Stream.of(names).filter(predicate).count();
        System.out.println("Count of 'Java': " + count1);

        name = "Kotlin";
        long count2 = Stream.of(names).filter(predicate).count();
        System.out.println("Count of 'Kotlin': " + count2);
    }
}