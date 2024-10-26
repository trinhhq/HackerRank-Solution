import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> candles = new ArrayList<>();
        for (int i=0; i<n; i++) {
            candles.add(ip.nextInt());
        }
        System.out.println(birthdayCakeCandles(candles));
    }
    
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        int countMax = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (max < candles.get(i)) {
                max = candles.get(i);
                countMax = 1;
            } else if (max == candles.get(i))
                countMax++;
        }
        return countMax;
    }
}
