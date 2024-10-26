import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        staircase(n);
    }
    
    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
