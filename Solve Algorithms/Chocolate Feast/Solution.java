import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for (int i=0; i<t; i++) {
            int n = ip.nextInt();
            int c = ip.nextInt();
            int m = ip.nextInt();
            System.out.println(chocolateFeast(n, c, m));
        }
    }
    
    public static int chocolateFeast(int n, int c, int m) {
        int wrappers = n/c;
        int total = wrappers;
        while (wrappers >= m) {
            total += wrappers/m;
            wrappers = wrappers%m + wrappers/m;
        }
        return total;
    }
}
