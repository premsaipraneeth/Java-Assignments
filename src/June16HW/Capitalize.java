package src.June16HW;

import java.util.Arrays;
import java.util.stream.Stream;

public class Capitalize {

    public static void main(String[] args) {
        String[] str = {"leo","lewandowski","gavi","xavi","pedri"};
        Stream s = Arrays.stream(str).map(name -> name.substring(0, 1).toUpperCase() + name.substring(1)).
        sorted();
        s.forEach(n-> System.out.println(n));
    }
}
