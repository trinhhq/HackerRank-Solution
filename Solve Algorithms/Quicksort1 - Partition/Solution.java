import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i<n; i++) {
           arr.add(ip.nextInt());
        }
        printArray(quickSort(arr));
    }
    private static void printArray(List<Integer> arr) {
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        
        int pivot = arr.get(0);
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < pivot) 
                left.add(arr.get(i));
            else 
                right.add(arr.get(i));
        }
        
        left.add(pivot);
        left.addAll(right);
        
        return left;
    }
}
