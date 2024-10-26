import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        System.out.println(viralAdvertising(n));
    }
    
    public static int viralAdvertising(int n) {
        int shared = 5, liked = 0, cumulate = 0;
        while(n > 0) {
            n--;
            liked = shared/2;
            cumulate += liked;
            shared = liked * 3;
        }
        return cumulate;
    }
}
