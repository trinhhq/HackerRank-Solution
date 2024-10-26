import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i=0; i<n; i++) {
            p.add(ip.nextInt());
        }
        printArray(permutationEquation(p));
    }
    
    public static void printArray(List<Integer> arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> result = new ArrayList<>();
        p.add(0, 0);
        for (int index = 1; index< p.size(); index++) {
            for (int i = 1; i< p.size(); i++) {
                if (index == p.get(i)) {
                    for (int j = 1; j < p.size(); j++) {
                        if (i == p.get(j)) {
                            result.add(j);
                        }
                    }
                }
            }
        }
        return result;
    }
}
