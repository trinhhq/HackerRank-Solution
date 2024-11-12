import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            a.add(ip.nextInt());
        }
        System.out.println(minimumDistances(a, n));
    }
    
    public static int minimumDistances(List<Integer> a, int n) {
        int min = n+1;
        for (int i = 0; i< n-1; i++) {
            for (int j = i + 1; j<n; j++) {
                if (a.get(i).equals(a.get(j))) {
                    if (j-i < min) {
                        min = j-i;
                        break;
                    }
                }
            }
            
        }
        return min == n+1 ? -1 : min;
    }
}
