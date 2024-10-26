import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i=0; i<n; i++) {
            a.add(ip.nextInt());
        }
        for (int i=0; i<m; i++) {
            b.add(ip.nextInt());
        }
        System.out.println(getTotalX(a, b));
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int left = 0, right = b.get(0), count = 0;
        for (int i = 0; i<a.size(); i++){
            if (left < a.get(i)) {
                left = a.get(i);
            }
        }
        for (int i = 0; i<b.size(); i++){
            if (right > b.get(i)) {
                right = b.get(i);
            }
        }
        
        for (int i = left; i<= right; i+=left) {
            int j= 0 , k = 0;
            for (j = 0; j< a.size(); j++){
                if (i % a.get(j) != 0) 
                    break;
            }
            if (j == a.size()) {
                for (k = 0; k< b.size(); k++){
                    if (b.get(k) % i != 0) 
                        break;
                }
            }
            if  (k == b.size()) count++;
        }
        return count; 
    }
}
