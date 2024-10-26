import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        List<Integer> a = new ArrayList<>(); 
        List<Integer> b = new ArrayList<>();
        for (int i=0; i<3; i++) {
            a.add(ip.nextInt());
        }
        for (int i=0; i<3; i++) {
            b.add(ip.nextInt());
        }
        printArray(compareTriplets(a, b));
    }
    
    public static void printArray(List<Integer> arr) {
        System.out.println(arr.get(0) + " " + arr.get(1));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        for (int i = 0; i< a.size(); i++) {
            if (a.get(i) > b.get(i)) 
                alice++;
            else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }
        return Arrays.asList(alice, bob);
    }
}
