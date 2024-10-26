import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> ranked = new ArrayList<>();
        for (int i=0; i<n; i++) {
            ranked.add(ip.nextInt());
        }
        int m = ip.nextInt();
        List<Integer> player = new ArrayList<>();
        for (int i=0; i<m; i++) {
            player.add(ip.nextInt());
        }
        printArray(climbingLeaderboard(ranked, player));
    }
    
    public static void printArray(List<Integer> arr) {
        for (int i: arr) {
            System.out.println(i);
        }
    }
    
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>();
        List<Integer> rankedList = new ArrayList<>(new TreeSet<>(ranked));
        int i = 0;
        int j = 0;
        while (i < player.size()) {
            while (j < rankedList.size()) {
                if (player.get(i) < rankedList.get(j)) {
                    break;
                }
                j++;
            }
            result.add(rankedList.size() - j + 1);
            i++;
        }
        return result;    
    }
}
