package Hashmaps;
import java.util.*;

public class basicset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Insert => TC O(1)
        set.add(25);
        set.add(5);
        set.add(85);
        set.add(45);
        set.add(32);
        System.out.println(set);
        // Search => TC O(1)
        System.out.println(set.contains(45));
        // Size
        System.out.println(set.size());
        // Remove => TC O(1)
        System.out.println(set.remove(5));
        System.out.println(set);
        // toArray
        Object[] arr = set.toArray();
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
