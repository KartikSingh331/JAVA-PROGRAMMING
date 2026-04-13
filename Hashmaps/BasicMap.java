package Hashmaps;

import java.util.HashMap;

public class BasicMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Raghav",23);
        map.put("Karan",45);
        map.put("Sambhavi",8);
        System.out.println(map);
        System.out.println(map.containsValue(45));
        map.put("Karan",487); // value update but in hashset this not
        map.put("Satya",8);
        System.out.println(map);
        map.remove("Karan"); // remove key-value pair
        System.out.println(map);
        System.out.println(map.get("Raghav"));
    }
}
