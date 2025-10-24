package TWO_D_ARRAY;
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class Basic_STL_Function_of_ARRAYLIST {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(20);
        a.add(15);
        a.add(85);  //in 1D arraylist element is added like this
        List<Integer> b = new ArrayList<>();
        b.add(50);
        b.add(99);
        b.add(65);
        List<Integer> c = new ArrayList<>();
        c.add(15);
        List<List<Integer>> l = new ArrayList<>();
        /* c.add(10); c.add(54);  */ // Element is not added in arraylist a 1D array is added
        l.add(a);
        l.add(b);
        l.add(c);
        //  System.out.print(a);  Not a good method
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(1).get(1)); //First get(1) is for 1 row of l matrix and another get(1) is for 1
            //index
        }

            System.out.println();
            System.out.println();
            for (int i = 0; i < l.size(); i++) {
                List<Integer> x = l.get(i);
                for (int j=0;j<x.size();j++){
                    System.out.print(x.get(j)+" ");
            }
                System.out.println();
            }

    }
}
