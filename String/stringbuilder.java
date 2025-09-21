package String;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(52);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuilder b=new StringBuilder();
        System.out.println(b.capacity());//because empty string has capacity of 16
        StringBuilder c=new StringBuilder("jdjd");
        System.out.println(c.capacity());//16+4=20 capacity
    }




}
