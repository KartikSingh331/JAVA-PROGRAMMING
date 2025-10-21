package Stack;
import java.util.*;
public class PushElementAtBottom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st_Original=new Stack <>();
        st_Original.push(78);
        st_Original.push(62);
        st_Original.push(68);
        st_Original.push(99);
        st_Original.push(8);
        System.out.println("Original Stack: "+st_Original);
        Stack<Integer> st_temp=new Stack <>();
        while (st_Original.size()>0){
            st_temp.push(st_Original.pop());
        }
        //Pushing in Original stack
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        st_Original.push(n);
        while (st_temp.size()>0){
            st_Original.push(st_temp.pop());
        }
        System.out.println(st_Original);
    }

}
