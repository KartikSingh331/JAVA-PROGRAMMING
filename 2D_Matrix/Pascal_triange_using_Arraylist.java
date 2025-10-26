package TWO_D_ARRAY;
import java.util.*;
public class Pascal_triange_using_Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> result = pascalarr(n);
        // Print the Pascal's triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
        static List<List<Integer>> pascalarr (int n){
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                List<Integer> l = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        l.add(1);
                    } else
                        l.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
                }
                ans.add(l);
            }
            return ans;
        }
    }
