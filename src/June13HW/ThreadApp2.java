package src.June13HW;

class Printno1 implements Runnable{
    public  void run(){
        for(int i = 1; i<6; i++){
            System.out.println(i);
        }
    }
}

class Printno2 implements Runnable{
    public void run(){
        for(int i = 6; i<11; i++){
            System.out.println(i);
        }
    }
}
public class ThreadApp2 {
    public static void main(String[] args) {
        Printno1 obj1 = new Printno1();
        Printno2 obj2 = new Printno2();

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();
    }
}
