package src.June22HW;

import java.util.HashSet;
import java.util.Iterator;

public class Duplicate {
    public static void main(String[] args) {
        String s = "aabcddeea";

        char c[] = s.toCharArray();

        HashSet<Character> h = new HashSet<>();

        for(char p:c){
            h.add(p);
        }

        Iterator<Character> i = h.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
