package Hashmaps;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Sharad", 1);
        map.put("Raghav", 23);
        map.put("Ashutosh", 89);
        map.put("Karan", 45);
        map.put("Sambhavi", 8);

        for (String key : map.keySet()) {
            int val = map.get(key);
            System.out.println(key + " -> " + val);
        }
    }
}