package Stack;
import java.util.*;
public class BasicIntro {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack <> ();
        st.push(5);
        st.push(8);
        st.push(2);
        st.push(15);
        st.push(72);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.size());
   // to access first inserted element
        while (st.size()>1){
            st.pop();
        }
        // size has become 1
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st);
    }
}
