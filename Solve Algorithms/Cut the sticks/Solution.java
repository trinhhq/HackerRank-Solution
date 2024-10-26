import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i< n; i++) {
            arr.add(ip.nextInt());
        }
        printArray(cutTheSticks(arr));
    }
    
    public static void printArray(List<Integer> arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int item: arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        int n = arr.size();
        list.add(n);
        for(int item: map.values()) {
            n = n - item;
            list.add(n);
        }
        list.remove(list.size()-1);
        return list;
    }
}