import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();
        Set<Integer> c = new TreeSet<>();
        for (int i = 0; i< m; i++) {
            c.add(ip.nextInt());
        }
        System.out.println(flatlandSpaceStations(n, new ArrayList<Integer>(c)));
    }
    
    static int flatlandSpaceStations(int n,  List<Integer> c) {
        int max = 0;
        for (int i = 0; i< c.size() - 1; i++) {
            int temp = (c.get(i+1) - c.get(i))/2;
            if (temp > max) {
                max = temp;
            } 
        }
        if (c.get(0) > max) {
            max = c.get(0);
        }
        if (n - c.get(c.size()-1) > max) {
            max = n - 1 - c.get(c.size()-1);
        }
        return max;
    }
}
