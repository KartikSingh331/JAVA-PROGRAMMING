package Recursion;

public class Function_call {
    public static void choco(){
        System.out.println("Hii loge ky");
    }
    public static void banana(){
        System.out.println("In banana");
        choco();
    }
    public static void mango(){
        System.out.println("In mango");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("In main");
        mango();
    }
}
