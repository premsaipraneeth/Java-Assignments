package src.Constructor.src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main3 {
    public static void main(String[] args) {
        Child c1 = new Child(6, 5);
        System.out.println(c1.geta());
        System.out.println(c1.getb());

        Child c2 = new Child(10);
        System.out.println(c2.getb());

    }
}