// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int n = 100;
        for (int i = 1; i < n; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i%3==0){
                System.out.println("Fizz");

            }
        }
    }
}

