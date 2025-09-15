package String;

public class deleat_and_insert {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kartiksingh");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.delete(2,5);
        System.out.println(sb);//in java last (5th) element not deleated for it put 6
        sb.insert(1,true);
        System.out.println(sb);
        sb.insert(2,65);
        System.out.println(sb);
    }
}
