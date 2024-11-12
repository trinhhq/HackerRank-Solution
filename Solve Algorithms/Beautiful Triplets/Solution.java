import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int d = ip.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            arr.add(ip.nextInt());
        }
        Collections.sort(arr);
        System.out.println(beautifulTriplets(d, arr));
    }
    
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count = 0;
        for (int i = 0; i< arr.size()-2; i++) {
            for (int j= i+1; j< arr.size()-1; j++) {
                if (arr.get(j) - arr.get(i) == d) {
                    for (int k = j+1; k< arr.size(); k++) {
                        if (arr.get(k) - arr.get(j) == d) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
