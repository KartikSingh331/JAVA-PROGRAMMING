package String;
import java.util.Scanner;
public class Frequencyarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] fre=new int[26];
        //a-0,b-1
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=(int)ch-97;
            fre[idx]++;
        }
        int maxfre=-1;
        for (int i=0;i<fre.length;i++){
            maxfre=Math.max(maxfre,fre[i]);
        }
        for (int i=0;i<fre.length;i++){
            if (fre[i]==maxfre){
                char ch=(char) (i+97);
                System.out.println(ch+" ");
            }
        }
    }
}
