import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for (int i=0; i<t; i++){
            int n = ip.nextInt();
            int m = ip.nextInt();
            int s = ip.nextInt();
            System.out.println(saveThePrisoner(n, m, s));
        }
    }
    
    public static int saveThePrisoner(int n, int m, int s) {
        return (m+s-2)%n + 1;
    }
}
