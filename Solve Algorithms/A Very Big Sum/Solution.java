import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        long sum =0;
        for (int i=0; i<n; i++) {
            sum += ip.nextLong();
        }
        System.out.println(sum);
    }
}
