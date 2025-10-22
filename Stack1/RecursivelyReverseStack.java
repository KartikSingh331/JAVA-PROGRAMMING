package Stack;
import java.util.*;
public class RecursivelyReverseStack {
    public static void displayReverse(Stack<Integer> st){
        if (st.size()==0) return;
        int top= st.pop();
        System.out.println(top);
        displayReverse(st);
//          System.out.println(top);   this give original form of stack
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverse(st);
    }


}
