package Hashmaps;

import java.util.HashMap;

public class iterativeMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Raghav",23);
        map.put("Karan",45);
        map.put("Sambhavi",8);
        System.out.println(map);
        for (String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();

    }
}
