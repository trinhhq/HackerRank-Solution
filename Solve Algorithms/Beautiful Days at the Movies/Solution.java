import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int i = ip.nextInt();
        int j = ip.nextInt();
        int k = ip.nextInt();
        System.out.println(beautifulDays(i, j, k));
    }
    
    public static int beautifulDays(int start, int end, int divisor) {
        int beautiful = 0;
        for (int i = start; i <= end; i++) {
            int reversedNum = Integer.parseInt(
                new StringBuilder(String.valueOf(i)).reverse().toString());
            int dif = Math.abs(i - reversedNum);
            if (dif % divisor == 0) beautiful++;
        }
        return beautiful;
    }
}
