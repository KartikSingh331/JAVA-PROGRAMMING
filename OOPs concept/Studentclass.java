package OOPs;

public class Studentclass {

    // Define static nested class
    public static class Student {
        String name;
        int rno;    // Changed from double to int
        double per;
    }

    public static void fun(Student y) {
        System.out.println("Student Name: " + y.name);
    }

    public static void fun(int z) {
        System.out.println("Integer Value: " + z);
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Raghav";
        x.rno = 92;
        x.per = 87;
        System.out.println("Updated Percentage: " + (x.per + 8));

//        int a = 4;
//        fun(a + 8);
//        fun(y);

    }
}
