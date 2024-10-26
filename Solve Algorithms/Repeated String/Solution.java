import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        Long n = ip.nextLong();
        System.out.println(repeatedString(s, n));
    }
    
    public static long repeatedString(String s, long n) {
        int count = 0, countRemain = 0;
        long repeat = n/s.length();
        int remain = (int)(n%s.length());
        for (int i = 0; i< s.length(); i++) {
            if(s.charAt(i) == 'a') {
                count++;
                if (i< remain) {
                    countRemain++;
                }
            }
        }
        return repeat * count + countRemain;
    }
}
