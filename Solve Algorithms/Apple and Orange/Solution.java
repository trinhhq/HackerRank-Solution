import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int s = ip.nextInt();
        int t = ip.nextInt();
        int a = ip.nextInt();
        int b = ip.nextInt();
        int m = ip.nextInt();
        int n = ip.nextInt();
        List<Integer> apples = new ArrayList<>();
        for (int i=0; i<m; i++) {
            apples.add(ip.nextInt());
        }
        List<Integer> oranges = new ArrayList<>();
        for (int i=0; i<n; i++) {
            oranges.add(ip.nextInt());
        }
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
    
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int d = 0;
        int countApples = 0;
        int countOrange = 0;
        for (int i = 0; i< apples.size(); i++) {
            d = apples.get(i) + a;
            if (d >= s && d<= t) {
                countApples++;
            }
        }
        for (int i = 0; i< oranges.size(); i++) {
            d = oranges.get(i) + b;
            if (d >= s && d<= t) {
                countOrange++;
            }
        }
        System.out.println(countApples);
        System.out.println(countOrange);
    }   
}
