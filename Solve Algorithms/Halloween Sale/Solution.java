import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int p = ip.nextInt();
        int d = ip.nextInt();
        int m = ip.nextInt();
        int s = ip.nextInt();
        System.out.println(howManyGames(p, d, m, s));
    }
    
    // 0 1 2 3 4 5
    // (5 - 0)*6/2 
    public static int howManyGames(int p, int d, int m, int s) {
        if (s < p) {
            return 0;
        } else {
            int numBeforeMin = (int)Math.ceil((p-m-0.0)/d);
            int numOfMinus = (numBeforeMin * (numBeforeMin - 1))/2;
            int totalBeforeMin = numBeforeMin*p - numOfMinus*d;
            int numOfmin = (s-totalBeforeMin)/m;
            int count = numBeforeMin + numOfmin;
            if (count <= 0) {
                s-=p;
                count = 0;
                while (s>0) {
                    p-=d;
                    s-=p;
                    count++;
                }
            }
            return count;
        }
        
    }
}
