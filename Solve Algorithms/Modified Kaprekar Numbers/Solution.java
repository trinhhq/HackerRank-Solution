import java.util.*;

public class Solution {
    public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       int p = ip.nextInt();
       int q = ip.nextInt();
       kaprekarNumbers(p, q);
    }
    
    public static void kaprekarNumbers(int p, int q) {
        boolean check = false;
        for (long i=p; i<=q; i++) {
            if (i==1) {
                check = true;
                System.out.print(i+" ");
            } else if (i>3) {
                long square = i * i;
                String str = String.valueOf(square);
                int middle = str.length()/2;
                int part1 = Integer.parseInt(str.substring(0, middle));
                int part2 = Integer.parseInt(str.substring(middle));
                if (part1 + part2 == i) {
                    check = true;
                    System.out.print(i+" ");
                }
            }
        }
        if (!check) System.out.println("INVALID RANGE");
    }
}
