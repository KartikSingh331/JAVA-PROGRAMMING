package Arays;
import java.util.ArrayList;
public class basics_of_arraylist {
    public static void main(String[] args) {
ArrayList<Integer> arr=new ArrayList<>(6);
arr.add(0,10);
arr.add(1,25);
arr.add(2,47);
arr.add(3,15);
arr.add(4,5);
for (int i=0;i<arr.size();i++){
    System.out.print(arr.get(i)+" ");
}
// print or
// System.out.print(arr);
        System.out.println();
arr.set(2,20); //for changing values at any index use get anf for printing use set
for (int i=0;i< arr.size();i++){
    System.out.print(arr.get(i)+"  ");
}
arr.add(100);
//this add value at the last (push back)
        System.out.println();

    }
}
