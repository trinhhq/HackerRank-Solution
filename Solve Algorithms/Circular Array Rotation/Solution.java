import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        int q = ip.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            a.add(ip.nextInt());
        }
        List<Integer> queries = new ArrayList<>();
        for (int i=0; i<q; i++) {
            queries.add(ip.nextInt());
        }
        printArray(circularArrayRotation(a, k, queries));
    }
    
    public static void printArray(List<Integer> arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        for (int  i = 0; i<k; i++) {
            a.add(0, a.remove(a.size()-1));
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i< queries.size(); i++) {
            result.add(a.get(queries.get(i)));
        }
        return result;
    }
}
