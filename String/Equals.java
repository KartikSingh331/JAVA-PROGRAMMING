package String;

public class Equals {
    public static void main(String[] args) {
        String a="XYZABC";
        String d="XYZABC";
    String b="XYZ";
    b=b+"ABC";
    String c=new String(a);
        System.out.println(a==b);
        System.out.println(a==d);
        System.out.println(a==c); //in string == operators compares only address if same return true
        System.out.println(a.equals(b)); //on == we may use equals() ope for comparing char by char
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
    }
}
