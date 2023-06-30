package src;

import java.util.Arrays;
import java.util.List;

public class Lis {
    public static void main(String[] args) {
        List<String> a= Arrays.asList("hello","hello2");
        a.remove(0);
        a.stream().forEach(System.out::println)
;    }
}
