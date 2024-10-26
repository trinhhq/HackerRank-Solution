import java.math.*;
import java.util.*;;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        extraLongFactorials(n);
    }
    
    public static void extraLongFactorials(int n) {
        BigInteger num = BigInteger.ONE;
        for (long i = 1; i <= n; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        System.out.println(num);
    }
}
