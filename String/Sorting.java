package String;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        //string can not be sorted by builtin fun. convert into char and then sorted same
        //Stringbuilder convert to string then char to be sorted
        String s="kartik";
        char[] ch=s.toCharArray();
        for (char ele:ch) {
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for (char ele:ch) {
            System.out.print(ele);
        }
        StringBuilder sb=new StringBuilder("kishan");
//        char[] ce=s.toString() toCharArray();
    }
}
