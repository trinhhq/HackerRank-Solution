import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int t = ip.nextInt();
        List<Integer> width = new ArrayList<>();
        for (int  i = 0; i<n; i++) {
            width.add(ip.nextInt());
        }
        for (int i = 0; i<t; i++) {
            int s = ip.nextInt();
            int e = ip.nextInt();
            System.out.println(serviceLane(width, s, e));
        }
    }
    
     public static int serviceLane(List<Integer> width, int s, int e) {
         int min = Integer.MAX_VALUE;
         for (int i = s; i <= e; i++) {
             if (min > width.get(i)) {
                 min = width.get(i);
             }
         }
         return min;
    }
}
