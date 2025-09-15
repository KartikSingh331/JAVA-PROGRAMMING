package String;

public class Count_vowels {
    public static void main(String[] args) {
        String str="kartik loves to do extreme hardwork that no One can do ever ";
                int n= str.length();
                int count=0;
                for(int i=0;i<n;i++) {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                            str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                            || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                        count++;
                    }
                }
        System.out.print(count);
    }

}
