import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        List<Integer> height = new ArrayList<>();
        for (int i=0; i<n; i++){
            height.add(ip.nextInt());
        }
        System.out.println(hurdleRace(k, height));
    }
    
    public static int hurdleRace(int k, List<Integer> height) {
        int max = 0;
        for (int num: height) {
            if (num > max) {
                max = num;
            }
        }
        return max > k? max - k: 0;
    }
}
