import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> scores = new ArrayList<>();
        for (int i=0; i<n; i++) {
            scores.add(ip.nextInt());
        }
        printArray(breakingRecords(scores));
    }
    
    public static void printArray(List<Integer> arr) {
        System.out.println(arr.get(0)+" "+arr.get(1));
    }
    
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>();
        int min = scores.get(0), max = scores.get(0);
        int totalMin = 0, totalMax = 0;
        for (int i = 1; i< scores.size(); i++) {
            if (min > scores.get(i)) {
                min = scores.get(i);
                totalMin++;
            } else if (max < scores.get(i)) {
                max = scores.get(i);
                totalMax++;
            }
        }
        result.add(totalMax);
        result.add(totalMin);
        return result;
    }
}
