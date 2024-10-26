import java.math.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i=0; i<n; i++){
            s.add(ip.nextInt());
        }
        System.out.println(nonDivisibleSubset(k, s));
    }
    
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] a = new int[k];
        int result = 0;
        for (int i = 0; i< s.size(); i++) {
            a[s.get(i)%k]+= 1;
        }
        int n = k%2 == 0 ? k/2 - 1 : k/2;
        for (int i = 1; i<= n; i++) {
            int max = Math.max(a[i], a[k-i]);
            result+= max;
        }
        if (a[0] != 0) result++;
        if(k%2 == 0){
            result += 1;
        }
        return result == 0 ? 1 : result;
    }
}
