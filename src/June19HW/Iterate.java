package src.June19HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterate {
    private static String player;

    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Leo");
        li.add("Lewandowski");
        li.add("Pedri");
        li.add("Gavi");
        li.add("Xavi");

        System.out.println("Using for loop");
        for(int i =0;i< li.size();i++){
            System.out.println(li.get(i));
        }

        System.out.println("                           ");

        System.out.println("Using Enhanced for loop");

        for (String player:li)
        {
            System.out.println(player);
        }

        System.out.println("                           ");

        System.out.println("Using Iterator");

        Iterator<String> it = li.iterator();

        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }

        System.out.println("                           ");

        System.out.println("Using Stream for Each");

        li.stream().forEach(s-> System.out.println(s));

        System.out.println("                           ");

        System.out.println("Using Parallel Stream");

        li.parallelStream().forEach(s-> System.out.println(s));


    }
}
