package Stack;
import java.util.*;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 54, 87, 55, 2};
        int n = arr.length;
        int[] result = nextGreater(arr, n);

        // Display the result
        System.out.println("Next Greater Elements:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static int[] nextGreater(int[] arr, int n) {
        int[] output = new int[n];
        output[n - 1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            //output[i] = st.isEmpty() ? -1 : st.peek();         OR
            if (st.isEmpty()) {
                output[i] = -1;
            } else {
                output[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return output;
    }
}
