package sobes_training;

public class ThreadDemo {
    private int count = 1;

    // Синхронизированный метод
    public synchronized void doSomething() {
        for (int i = 0; i < 10; i++) {
            System.out.println(count++);
        }
    }

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo();
        Thread a1 = new Thread(String.valueOf(demo));
        Thread a2 = new Thread(String.valueOf(demo));
        a1.start();
        a2.start();
    }
}

class A extends Thread {
    ThreadDemo demo;

    A(ThreadDemo td) {
        demo = td;
    }

    public void run() {
        demo.doSomething();
    }
}