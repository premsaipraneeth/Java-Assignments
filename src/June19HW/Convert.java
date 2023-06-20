package src.June19HW;

import java.util.ArrayList;
import java.util.List;

public class Convert {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Leo");
        li.add("Lewandowski");
        li.add("Pedri");
        li.add("Gavi");
        li.add("Xavi");

        String[] s = li.toArray(new String[0]);

        for(String w:s){
            System.out.println(w);
        }

    }
}
