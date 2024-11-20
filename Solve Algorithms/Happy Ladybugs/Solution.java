import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int g = ip.nextInt();
        for (int i = 0; i< g; i++) {
            int n = ip.nextInt();
            ip.nextLine();
            String b = ip.nextLine();
            System.out.println(happyLadybugs(b));
        }
    }
    
    public static String happyLadybugs(String b) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<b.length(); i++) {
            char key = b.charAt(i);
            int value = map.getOrDefault(key, 0) + 1;
            map.put(key, value);
        }
        if (map.containsKey('_')) {
            boolean happyCheck = true;
            for (char c : map.keySet()) {
                if (c != '_') {
                    if (map.get(c) == 1) {
                        happyCheck = false;
                    }
                }
            }
            return happyCheck ? "YES" : "NO";
        } else {
            if (b.length() == 1) {
                return "NO";
            } else {
                boolean happyCheck = true;
                for (int i = 1; i< b.length()-1; i++) {
                    if (b.charAt(i) != b.charAt(i-1) 
                    && b.charAt(i) != b.charAt(i+1)) {
                        happyCheck = false;
                    }
                }
                if (b.charAt(0) != b.charAt(1) 
                || b.charAt(b.length()-1) != b.charAt(b.length()-2)) {
                    happyCheck = false;
                }
                return happyCheck ? "YES" : "NO";
            }
        }
    }
}
