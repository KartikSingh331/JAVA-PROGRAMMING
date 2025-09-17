package String;

public class Interning_and_newKeyword {
    public static void main(String[] args) {
        String a="Raghav";
        String b="Raghav";// same string in memory only name is different but in array is not
        String c=new String("Raghav");// this is new string in memory because of new keyword

    }
}
