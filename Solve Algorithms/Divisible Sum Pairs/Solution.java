import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        List<Integer> ar = new ArrayList<>();
        for (int i=0; i<n; i++) {
            ar.add(ip.nextInt());
        }
        System.out.println(divisibleSumPairs(n, k, ar));
    }
    
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int result = 0;
        for(int i = 0; i< n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if ((ar.get(i)+ar.get(j)) % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
