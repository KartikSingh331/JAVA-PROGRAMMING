package Recursion;
import java.util.*;
public class pretoPost {
    public static void pip(int n){
        if(n==0) return ;
     //   System.out.print(n);//pre
        System.out.println("pre"+n);
        pip(n-1);
      //  System.out.print(n);//in
        System.out.println("In"+ n);
        pip(n-1);
      //  System.out.print(n);//post
        System.out.println("Postr"+n);
    }
    public static void main(String[] args) {
        pip(3);
    }
}
