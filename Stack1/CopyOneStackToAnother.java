package Stack;
import java.util.*;
public class CopyOneStackToAnother {
    public static void main(String[] args) {
        Stack<Integer> st_Original=new Stack <>();
        st_Original.push(58);
        st_Original.push(62);
        st_Original.push(68);
        st_Original.push(99);
        st_Original.push(8);
        System.out.println("Original Stack: "+st_Original);
        Stack<Integer> st_Reversed = new Stack<>();
        while (!st_Original.isEmpty()) {
            int element = st_Original.pop();
            st_Reversed.push(element);
            // Or
//            st_Reversed.push(st_Original.pop());
        }
        System.out.println("Reversed Stack; "+st_Reversed);
        // lets build original stack
        while (!st_Reversed.isEmpty()){
            st_Original.push(st_Reversed.pop());
        }
        System.out.println("Copied Stack"+st_Original);
    }
}
