import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i< n; i++) {
            c.add(ip.nextInt());
        }
        System.out.println(jumpingOnClouds(c));
    }
    
    public static int jumpingOnClouds(List<Integer> c) {
        int result = 0;
        int i = 0;
        while (i != (c.size()-1)) {
            if (i == (c.size()-2)) break;
            if (c.get(i+2) == 0) {
                i += 2;
            } else {
                i += 1;
            }
            result+=1;
        }
        if (i == (c.size()-2)) result++;
        return result;
    }
}
