import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner  ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i=0; i<n; i++) {
            s.add(ip.nextInt());
        }
        int d = ip.nextInt();
        int m = ip.nextInt();
        System.out.println(birthday(s, d, m));
    }
    
    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0, i = 0;
        while ((i+m) <= s.size()) {
            int sum = 0;
            for (int j = i; j< i+m; j++ ) {
                sum+= s.get(j);
                if (sum> d) break;
            }
            if (sum == d) result++;
            i++;  
        }
        return result;
    }
}
