package src.June22HW;

import java.util.HashSet;
import java.util.Iterator;

public class Hashse {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Messi");
        h.add("Lewandowski");
        h.add("Xavi");
        h.add("Araujo");
        h.add("Gundogan");

        System.out.println("Iterating using Iterator");

        Iterator<String> i = h.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("                                   ");

        System.out.println("Iterating using for each method. ");

        for(String s: h){
            System.out.println(s);
        }

        System.out.println("                                   ");

        System.out.println("Iterating using stream for-each method");

        h.stream().forEach(s-> System.out.println(s));

    }
}
