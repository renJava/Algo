package sobes_training;

import java.util.List;

public class CompileError {
    public static class Main {

        public static void main(String[] args) {

        }

/*
        public static <T> T getFirst(List<? super T> list) {
            return list.get(0);
        }
*/

        public static <T> T getFirst0(List<? extends T> list) {
            return list.get(0);
        }

/*
        public static <T> T getFirst1(List<? extends T> list) {
            return list.get(0);
        }
*/

        public static <T> T getFirst1(List<? super T> list) {
            return list.isEmpty() ? null : (T) list.get(0);
        }

        public static <T> T getFirst2(List<? extends T> list) {
            return list.get(0);
        }

/*
        public static <T> void putLast(List<? super T> list, T t) {
            return list.add(t);
        }
*/

        public static <T> void putLast(List<? super T> list, T t) {
            list.add(t);
        }

    }
}
