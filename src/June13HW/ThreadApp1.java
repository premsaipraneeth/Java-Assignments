package src.June13HW;

class Print1 extends Thread{

    public void run(){
        for(int i = 1; i<6; i++){
            System.out.println(i);
        }
    }
}

class Print2 extends Thread{

    public void run(){
        for(int i = 6; i<11; i++){
            System.out.println(i);
        }
    }
}
public class ThreadApp1 {
    public static void main(String[] args) {

        Print1 thread1 = new Print1();
        Print2 thread2 = new Print2();

        thread1.start();
        thread2.start();

    }


}
