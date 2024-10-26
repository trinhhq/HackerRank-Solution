import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int p = ip.nextInt();
        System.out.println(pageCount(n, p));
    }
    public static int pageCount(int n, int p) {
        return Math.min((n/2-p/2), p/2);
    }
}
