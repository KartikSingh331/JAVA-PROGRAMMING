package Stack;
import java.util.*;
public class previousGreatestElement {
    public static void main(String[] args) {
        int[] arr={10,4,8,54,87,55,2};
        int n=arr.length;
        preGreatest(arr,n);
    }
    public static void preGreatest(int[] arr,int n){
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        System.out.print("-1 ");
        for (int i=1;i<n;i++) {
            while (!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            if (st.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(st.peek() +" ");
            st.push(arr[i]);
        }
    }
}
