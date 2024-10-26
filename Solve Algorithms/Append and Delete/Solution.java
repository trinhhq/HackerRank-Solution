import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        String t = ip.nextLine();
        int k = ip.nextInt();
        System.out.println(appendAndDelete(s, t, k));
    }
    
    public static String appendAndDelete(String s, String t, int k) {
        int same = 0;
        int n = Math.min(t.length(), s.length());
        while(same<n) {
            if (s.charAt(same) == t.charAt(same)) {
                same++;
            } else {
                break;
            }
        }
        int change = 0;
        int diff = Math.abs(s.length()-t.length());
        if (s.length() <= t.length()) {
            change = (s.length() - same) *2 + diff;
        } else if (s.length() > t.length()) {
            change = (s.length() - same) *2 - diff;
        }
        if (change == k) {
            return "Yes";
        } else if (change < k) {
            if ((k- change) % 2 == 0) {
                return "Yes";
            } else if ((k-change) > 2*(same)) {
                return "Yes";
            }
        } 
        return "No";
    }
}
