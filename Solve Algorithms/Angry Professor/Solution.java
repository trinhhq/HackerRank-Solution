import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();

        for (int i=0; i< t; i++) {
            int n = ip.nextInt();
            int k = ip.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int j=0; j<n; j++) {
                a.add(ip.nextInt());
            }
            System.out.println(angryProfessor(k, a));
        }
    }

    public static String angryProfessor(int k, List<Integer> a) {
        int attend = 0;
        for (int i = 0; i < a.size() ; i++) {
            if (a.get(i) <= 0) attend++;
            if (attend >= k) break;
        }
        return attend >= k ? "NO" : "YES";
    }
}
