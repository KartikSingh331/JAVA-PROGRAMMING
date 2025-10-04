package Recursion;
import java.util.*;
public class Subset {
    static ArrayList<String> arr=new ArrayList<>();
  public static void   printSubset(int i,String s,String ans){
      if (i==s.length()){
//          System.out.println(ans);  isse bhi ho jayega arraylist htao
          arr.add(ans);
          return;
      }
      char ch=s.charAt(i);
      printSubset(i+1,s,ans+ch); //take
      printSubset(i+1,s,ans);//not take
  }
    public static void main(String[] args) {
        String s="abc";
        arr=new ArrayList<>(); // not necessary only for reset it help in leetcode when multiple operation is performed on same ArrayList
        printSubset(0,s,"");
        System.out.print(arr);
    }
}
