import java.math.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int q = ip.nextInt();
        for (int i=0; i<q; i++) {
            int a = ip.nextInt();
            int b = ip.nextInt();
            System.out.println(squares(a, b));
        } 
    }
    
    public static int squares(int a, int b) {
        int count = 0;
        int num = 0;
        while (a<=b) {
            double sqrt = Math.sqrt(a);
            if(sqrt - Math.floor(sqrt) == 0) {
                num = (int)Math.floor(sqrt);
                break;
            }
            a++;
        }
        if (num == 0) return 0;
        while ((num*num) <= b) {
            num++;
            count++;
        }
        return count;
    }
}