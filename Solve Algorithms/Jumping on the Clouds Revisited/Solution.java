import java.util.*;

public class Solution {    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        int[] c = new int[n];
        for (int i=0; i<n; i++) {
            c[i] = ip.nextInt();
        }
        System.out.println(jumpingOnClouds(c, k));
    }
    
    public static int jumpingOnClouds(int[] c, int k) {
        int energy = 100, position = 0;
        do {
            if (c.length > (position + k)) {
                position+= k;
            } else {
                position = position + k - c.length;
            }
            energy = energy - c[position]*2 - 1;
        } while (position != 0);
        return energy;
    }
}
