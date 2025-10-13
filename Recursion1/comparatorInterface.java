package Recursion;

import java.util.*;

public class comparatorInterface {
    public static void main(String[] args) {
        Comparator <Integer> obj=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) return 1;
                else return -1;
            }
        }
        List <Integer> nums=new ArrayList<>();
        nums.add(41);
        nums.add(42);
        nums.add(43);
        Collections.sort(nums,obj);
        System.out.println(nums);
    }
}
