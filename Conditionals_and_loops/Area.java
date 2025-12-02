package Conditionals_and_Loops;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Float l=sc.nextFloat();
    Float b=sc.nextFloat();
    Float area=l*b;
    Float perimeter=2*(l+b);
    if(area>peri){
        System.out.println("AREA IS GREATER");
    } else if (perimeter>area) {
        System.out.println("Perimeter is larger");
    }
    else
    {
        System.out.println("Area and perimeter both are equal");
    }

    }
}


