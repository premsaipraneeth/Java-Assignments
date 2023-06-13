package src.June12HW;


import java.util.Arrays;

public class Exceptint {

    public static void main(String[] args) {
        String[] s = new String[]{"23", "45.67" , "test", "123f"};
        for(String str: s){
            toInt(str);
        }
    }

    private static void toInt(String str) {
        try{
           int i = Integer.parseInt(str);
            System.out.println(i);
        }
        catch(Exception e){
            System.out.println("Exception thrown");
        }
    }
}
