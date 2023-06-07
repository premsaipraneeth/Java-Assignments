package src.Fibonacci.src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main7 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int TotalSum;

        for(int i = 0; i<10; i++){

            TotalSum= a+b;
            System.out.println(TotalSum);
            a = b;
            b = TotalSum;

        }


    }

}