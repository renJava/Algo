import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ArrayDifference {
    public static final Logger logger = Logger.getLogger(ArrayDifference.class.getName());
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(1, 2, 2, 3));
        List<Integer> b = new ArrayList<>(List.of(2));
        List<Integer> result = arrayDiff(a, b);
        logger.info(result.toString()); // Output: [1, 3]

        List<Integer> c = null;
        List<Integer> d = new ArrayList<>(List.of(1, 2));
        List<Integer> emptyResult = arrayDiff(c, d);
        logger.info(emptyResult.toString()); // Output: []
    }

    public static List<Integer> arrayDiff(List<Integer> a, List<Integer> b) {
        if (a == null || b == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>(a);
        result.removeAll(b);
        return result;
    }
}