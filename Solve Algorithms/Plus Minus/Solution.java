import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            arr.add(ip.nextInt());
        }
        plusMinus(arr);
    }
    
    public static void plusMinus(List<Integer> arr) {
        Double pos = 0.0, neg = 0.0;
        for (Integer i : arr) {
            if (i > 0) pos ++;
            else if (i< 0) neg++;
        }
        int n = arr.size();
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(1-pos/n-neg/n);
    }
}
