import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for (int i = 0; i< t; i++) {
            int n = ip.nextInt();
            int a = ip.nextInt();
            int b = ip.nextInt();
            printArray(getLastStone(n, a, b));
        }
    }
    
    public static void printArray(Set<Integer> arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static Set<Integer> getLastStone(int n, int a, int b) {
        Set<Integer> arr = new TreeSet<>();
        for (int i = 0; i< n; i++) {
            int sum = a*(n-i-1) + i*b;
            arr.add(sum);
        }
        return arr;
    }
}
