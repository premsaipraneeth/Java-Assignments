package src.JUNE6HW;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args)
    {
        Integer [] a  = new Integer[]{200, 300, 600, 500, 700};

        Collections.reverse(Arrays.asList(a));

        System.out.println(Arrays.asList(a));
    }
}

