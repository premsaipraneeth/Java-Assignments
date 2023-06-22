package src.June20HW;

import java.util.HashMap;

public class Targetmap {

    public static void main(String[] args) {
        int[] in = {10,20,30,40,50,60};
        int target = 90;

        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i =0;i<in.length;i++){
            int key = target - in[i];
            if(h.containsKey(key)){
                int j = h.get(key);
                System.out.println("Indexes are: "+ j+" and "+ i);
            }
            else{
                h.put(in[i],i);
            }
        }
    }
}
