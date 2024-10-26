import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for (int i=0; i<t; i++) {
            int n = ip.nextInt();
            System.out.println(findDigits(n));
        }
    }
    
    public static int findDigits(int n) {
        int num = n, count = 0;
        while (n != 0) {
            int digit = n%10;
            if (digit != 0) {
                if (num % digit == 0) count++;
            } 
            n/=10;
        }
        return count;
    }
}
