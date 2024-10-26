import java.util.*;

public class Solution {
    public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       int d1 = ip.nextInt();
       int m1 = ip.nextInt();
       int y1 = ip.nextInt();
       int d2 = ip.nextInt();
       int m2 = ip.nextInt();
       int y2 = ip.nextInt();
       System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
    }
    
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) return (y1-y2)*10000;
        else if (y1 < y2) return 0;
        else {
            if (m1 > m2) return (m1-m2)*500;
            else if (m1 < m2) return 0;
            else {
                if (d1-d2 > 0) return (d1-d2)*15;
                else return 0;
            }
        }
    }
}