package Queue;
import java.util.*;

public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>(); // Queue is an abstract data type therefore it cannot be accessed directly
        //it can be by linkedlist array or others
        System.out.println(queue.size());
        //Add or push operation in queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue);
        queue.poll(); // same as remove method
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
