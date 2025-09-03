package sobes_training;

/**
 * Что будет выведено на консоль?
 */
public class TestAB {
    class A {
        String str = "ab";

        A() {
            printLength();     // A.this.printLength();
        }

        void printLength() {
            System.out.println(str.length());
        }
    }

    class B extends A {
        String str = "abc";

        @Override
        void printLength() {
            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {

/*
        TestAB testAB = new TestAB(); // Создаем объект TestAB
        TestAB.B b = testAB.new B(); // Создаем объект B
*/
/*
        TestAB testAB = new TestAB(); // Создаем объект Test
        TestAB.A a = testAB.new A(); // Создаем объект B
*/
        new TestAB().new B();

    }
}

