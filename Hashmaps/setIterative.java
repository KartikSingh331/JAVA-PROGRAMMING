package Hashmaps;
import java.util.*;

public class setIterative {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(25);
        set.add(5);
        set.add(85);
        set.add(45);
        set.add(32);

        for(int ele: set){
            System.out.print(ele+" ");
        }

    }
}
