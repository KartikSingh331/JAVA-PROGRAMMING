package Queue;
import java.util.*;

public class ReverseInQueue {
    static Queue<Integer> queue = new ArrayDeque<>();

    static void print() {
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    public static void queuereverse() {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queuereverse();
        print();  // Will print 5, 4, 3, 2, 1
    }
}
