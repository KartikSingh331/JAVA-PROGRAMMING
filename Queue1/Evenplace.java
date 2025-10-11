package Queue;

import java.util.*;

public class Evenplace {
    static Queue<Integer> que;
    static Queue<Integer> newque;
    static void removeEven(){
        newque =new LinkedList<>();
        while (!que.isEmpty()){
            que.remove();
        }
    }

    public static void main(String[] args) {
        que =new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);
     removeEven();
        System.out.println(newque);
    }
}