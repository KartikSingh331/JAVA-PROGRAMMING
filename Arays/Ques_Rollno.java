package Arays;

public class Ques_Rollno {
    public static void main(String[] args) {
        //Given an array of marks of students, if the marks of an any student
        // is less than 35 print its roll number where roll number here refers to the index of the array

        int arr[]={12,15,18,55,58,95,87,75,32};
        int n= arr.length;
        System.out.println(n);
        for (int i=0;i<n;i++){
            if (arr[i]<35)
                System.out.print(i+" ");

        }
    }
}
