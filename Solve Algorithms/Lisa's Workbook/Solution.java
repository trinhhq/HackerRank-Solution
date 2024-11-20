import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i< n; i++) {
            arr.add(ip.nextInt());
        }
        System.out.println(workbook(n, k, arr));
    }
    
    public static int workbook(int n, int k, List<Integer> arr) {
        int count = 0, page = 1;
        for (int i = 0; i< n; i++) {
            for (int j = 1; j<=arr.get(i); j++) {
                if (page == j) {
                    count++;
                }
                if (j%k == 0) {
                    page++;
                }
            }
            if (arr.get(i) % k != 0) {
                page++;
            }
        }
        return count;
    }
}
