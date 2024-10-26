import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = ip.nextInt();
        for (int i = 0; i<n; i++) {
            arr.add(ip.nextInt());
        }
        System.out.println(equalizeArray(arr));    
    }
        
    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : arr) {
            int temp = map.getOrDefault(item, 0) + 1;
            map.put(item, temp);
        }
        int max = 0;
        for (int value: map.values()) {
            if (value > max) max = value;
        }
        return arr.size() - max;
    }
}