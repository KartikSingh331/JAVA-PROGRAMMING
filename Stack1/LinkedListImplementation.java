package Stack;

public class LinkedListImplementation {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    Node head = null;
    int size = 0;

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int size() {
        return size;
    }

    int pop() {
        if (head == null) {
            System.out.println("Empty");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }

    int peek() {
        if (head == null) {
            System.out.println("Empty");
            return -1;
        }
        return head.val;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        return false; // linked list never full
    }

    void displayRec(Node h) {
        if (h == null)
            return;
        System.out.println(h.val);
        displayRec(h.next);
    }

    void display() {
        if (head == null)
            return;
        displayRec(head);
    }

    public static void main(String[] args) {
        LinkedListImplementation st = new LinkedListImplementation();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(47);

       System.out.println("Top element: " + st.peek());
        System.out.println("Size: " + st.size());
        System.out.println("Popped element: " + st.pop());
        System.out.println("Stack after pop:");
        st.display();
        System.out.println("Is empty? " + st.isEmpty());
        System.out.println("Is full? " + st.isFull());
    }
}
