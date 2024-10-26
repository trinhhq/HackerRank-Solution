import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            arr.add(ip.nextInt());
        }
        System.out.println(migratoryBirds(arr));
    }
    
    public static int migratoryBirds(List<Integer> arr) {
        int result = 0;
        int max = 0;
        List<Integer> integerList = Arrays.asList(0, 0, 0, 0, 0, 0);
        for (int item : arr) {
            int tmp = integerList.get(item) + 1;
            integerList.set(item, tmp);
        }
        for (int i = 1; i< integerList.size(); i++) {
            if (max < integerList.get(i)) {
                max = integerList.get(i);
                result = i;
            }
        }
        return result;

    }
}
