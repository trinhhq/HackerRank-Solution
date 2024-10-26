import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();
        ip.nextLine();
        List<String> topic = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String tmp = ip.nextLine();
            topic.add(tmp);
        }
        acmTeam(topic, n, m);   
    }
    
    public static void acmTeam(List<String> topic, int n, int m) {
        int max = 0;
        int countMax = 0;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                int total = getTopic(topic.get(i), topic.get(j));
                if (total > max) {
                    max = total;
                    countMax = 1;
                } else if (total == max) {
                    countMax++;
                }
            }
        }
        System.out.println(max);
        System.out.println(countMax);
    }
    
    public static int getTopic(String a, String b) {
        int count=0;
        for (int i = 0; i<a.length(); i++) {
            if((a.charAt(i) == '1') || (b.charAt(i) == '1')) {
                count++;
            }
        }
        return count;
    }
}
