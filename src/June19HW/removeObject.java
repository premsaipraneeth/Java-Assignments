package src.June19HW;

import java.util.ArrayList;
import java.util.List;

public class removeObject {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Leo");
        li.add("Lewandowski");
        li.add("Pedri");
        li.add("Gavi");
        li.add("Xavi");

        li.remove(li.size()-1);

        for(int i = 0;i<li.size();i++){
            System.out.println(li.get(i));
        }
    }
}
