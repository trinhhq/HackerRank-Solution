import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<n; j++) {
                row.add(ip.nextInt());
            }
            arr.add(row);
        }
        System.out.println(diagonalDifference(arr));
    }
    
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        // 5 6 7 8
        // 5 5 5 5
        // 5 5 5 5
        // 5 5 5 5
        int result = 0;
        int n = arr.size();
        for (int i = 0; i< n; i++) {
            result+= arr.get(i).get(i);
            result-= arr.get(i).get(n - i -1);
        }
        return Math.abs(result);
    }

}
