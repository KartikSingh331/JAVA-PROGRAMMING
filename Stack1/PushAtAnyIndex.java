package Stack;
import java.util.*;
public class PushAtAnyIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st_Original = new Stack<>();
        st_Original.push(78);
        st_Original.push(62);
        st_Original.push(68);
        st_Original.push(99);
        st_Original.push(8);
        System.out.println("Original Stack: " + st_Original);
        System.out.println("Enter the desired index: ");
        int n=sc.nextInt();
        Stack<Integer> st_temp=new Stack <>();
        while (st_Original.size()>=n){
            st_temp.push(st_Original.pop());
        }
        System.out.print("Enter the value to be inserted: ");
        int m=sc.nextInt();
        st_Original.push(m);
        while (st_temp.size()>0){
            st_Original.push(st_temp.pop());
        }
        System.out.println("New list: "+st_Original);
    }
}