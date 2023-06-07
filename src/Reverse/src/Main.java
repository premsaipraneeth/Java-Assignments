package src.Reverse.src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int number = 12345;
        int output = 0;
        while (number != 0) {
            int remainder = number % 10;
            output = (output * 10) + remainder;
            number = number / 10;

        }

        System.out.println(output);

    }
}