package String;
public class concat {
    public static void main(String[] args) {
        String a="XYZ";
        String b="Abc";
        System.out.println(a+b);
        // or
        System.out.println(a.concat(b));
        //or changing whole a
        a=a.concat(b);
        System.out.println(a);
        System.out.println(a.toUpperCase());
    }
}
