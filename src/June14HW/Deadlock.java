package src.June14HW;

public class Deadlock {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (s1) {
                    System.out.println("Thread 1 and object1");

                    synchronized (s2) {
                        System.out.println("Thread 1 and object2");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (s2) {
                    System.out.println("Thread 2 and object2");

                    synchronized (s1) {
                        System.out.println("Thread 2 and object1");
                    }
                }

            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
