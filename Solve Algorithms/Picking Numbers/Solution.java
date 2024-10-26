import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            a.add(ip.nextInt());
        }
        System.out.println(pickingNumbers(a));
    }
    
    public static int pickingNumbers(List<Integer> a) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxLength = 0;
        for (int num : frequencyMap.keySet()) {
            int currentFrequency = frequencyMap.get(num);
            int nextFrequency = frequencyMap.getOrDefault(num + 1, 0);
            int currentSubarrayLength = currentFrequency + nextFrequency;
            maxLength = Math.max(maxLength, currentSubarrayLength);
        }

        return maxLength;
    }
}
