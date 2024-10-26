import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<5; i++) {
            arr.add(ip.nextInt());
        }
        miniMaxSum(arr);
    }
    
    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(null);
        long sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum+= arr.get(i);
        }
        long min = sum-arr.get(4);
        long max = sum-arr.get(0);
        System.out.println( min + " " + max);
    }
}
