import java.util.*;

public class Solution {
    public static void main(String[] args)  {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for (int i=0; i<t; i++) {
            long b = ip.nextLong();
            long w = ip.nextLong();
            long bc = ip.nextLong();
            long wc = ip.nextLong();
            long z = ip.nextLong();
            System.out.println(taumBday(b, w, bc, wc, z));
        }
    }
    
    public static long taumBday(long b, long w, long bc, long wc, long z) {
        long result = 0;
        if (bc > wc + z) {
            result = (wc + z) * b + wc * w;
        } else if (wc > bc + z) {
            result = (bc + z) * w + bc * b;
        } else {
            result = wc * w + bc * b;
        }
        return result;
    }
}
