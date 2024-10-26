import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> ar = new ArrayList<>();
        for (int i=0; i<n; i++) {
            ar.add(ip.nextInt());
        }
        System.out.println(sockMerchant(n, ar));
    }
    
    public static int sockMerchant(int n, List<Integer> ar) {
        int result = 0;
        HashMap<Integer, Integer> sockMap = new HashMap<>();
        for (int item: ar) {
            if (sockMap.containsKey(item)){
                sockMap.put(item, sockMap.get(item)+1);
            } else {
                sockMap.put(item, 1);
            }
        }
        for (int count: sockMap.values()) {
            result += count/2;
        }
        return result;
    }
}
