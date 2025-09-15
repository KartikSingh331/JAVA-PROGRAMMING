package String;

public class indexof_compareTo {
    public static void main(String[] args) {
        String s="ka re babua";
        System.out.println(s.indexOf('A'));
        System.out.println(s.indexOf('k'));
        System.out.println(s.lastIndexOf('a'));
        String a="Loves";
        String b="Love"; //compare in ASCII code
        String c="aacddd";
        String d="aac";
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(d));

        // startswith and contains
        System.out.println(a.startsWith("lo"));
        System.out.println(a.startsWith("Lo"));
        System.out.println(a.contains("ve"));

    }
}
