import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int b = ip.nextInt();
        int n = ip.nextInt();
        int m = ip.nextInt();
        int[] keyboards = new int[n];
        for (int i=0; i<n; i++) {
            keyboards[i] = ip.nextInt();
        }
        int[] drives = new int[m];
        for (int i=0; i<m; i++) {
            drives[i] = ip.nextInt();
        }
        System.out.println(getMoneySpent(keyboards, drives, b));
    }
    
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
         int result = -1;
         int sum = 0;
         for (int i = 0; i< keyboards.length; i++) {
            for (int j= 0; j< drives.length; j++) {
                sum = keyboards[i]+drives[j];
                if (sum == b) {
                    return b;
                } else if (sum < b && sum > result) {
                    result = sum;
                }
            }
         }
         return result;
    }
}
