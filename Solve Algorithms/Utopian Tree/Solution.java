import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for (int i=0; i<t; i++){
            int n = ip.nextInt();
            System.out.println(utopianTree(n));
        }
    }
    
    public static int utopianTree(int n) {
        int h = 1;
        for (int i = 1; i<= n; i++) {
            if (i % 2 != 0) {
                h*=2;
            } else {
                h++;
            }
        }
        return h;
    }
}
