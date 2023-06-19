package src.June16HW;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Squares {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};
        OptionalDouble d = Arrays.stream(i).filter(n -> n % 2 != 0)
                .mapToDouble(n -> n * n)
                .average();
        System.out.println(d);
    }
}
