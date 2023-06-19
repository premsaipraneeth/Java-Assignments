package src.June16HW;

import java.util.Arrays;
import java.util.stream.Stream;

public class Vowel {
    public static void main(String[] args) {
        String[] str = {"leo","lewandowski","gavi","xavi","pdr"};
         Stream st = Arrays.stream(str).filter(s -> {
             return s.matches(".*[aeiou].*");});

         //long c = st.count();

         st.forEach(n-> System.out.println(n));

        //System.out.println(c);
    }
}
