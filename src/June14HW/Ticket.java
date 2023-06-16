package src.June14HW;

class Booking {
    int tickets = 1000;

    public synchronized void decrement() {
        tickets--;
    }
}

public class Ticket {
    public static void main(String[] args) throws InterruptedException {

        Booking b1 = new Booking();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 501; i++) {
                    b1.decrement();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 501; i++) {
                    b1.decrement();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(b1.tickets);

    }
}
