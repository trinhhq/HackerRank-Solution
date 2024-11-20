import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> B = new ArrayList<>();
        int countOdd = 0;
        for (int i=0; i<n; i++) {
            B.add(ip.nextInt());
            if (B.get(i) % 2 != 0) {
                countOdd++;
            }
        }
        if (countOdd % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println(fairRations(B, n));
        }
    }
    // 0 0 1 0 0 1 0 0 0 1 1 1
    public static int fairRations(List<Integer> B, int n) {
        int result = 0;
        for (int i = 0; i< n-1; i++) {
            if (B.get(i) % 2 != 0) {
                for (int j = i+1; j< n; j++) {
                    if (B.get(j) % 2 != 0) {
                        result += (j-i)*2;
                        i = j;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
