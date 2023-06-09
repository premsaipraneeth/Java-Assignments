package src.June7HW;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse {

    public static void main(String[] args) {

        String str = "Java J2EE Reverse Me";

        String reverse = Arrays.stream(str.split(" "))
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reverse);

    }

}
