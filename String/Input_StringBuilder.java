package String;
import java.util.*;
public class Input_StringBuilder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        StringBuilder sb=new StringBuilder(sc.next());
        System.out.println(sb);
        sb.setCharAt(0,'A');
        System.out.println(sb);
    }
}
