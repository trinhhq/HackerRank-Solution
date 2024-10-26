import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        int r_q = ip.nextInt();
        int c_q = ip.nextInt();
        List<List<Integer>> obstacles = new ArrayList<>();
        for (int i=0; i<k; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(ip.nextInt());
            list.add(ip.nextInt());
            obstacles.add(list);
        }
        System.out.println(queensAttack(n, k, r_q, c_q, obstacles));
    }
    
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int result = 0;
        int top_mid=n-r_q, bot_mid=r_q-1, right=n-c_q, left=c_q-1,
            top_right=Math.min(n-r_q, n-c_q), top_left=Math.min(n-r_q, c_q-1),
            bot_right=Math.min(r_q-1, n-c_q), bot_left=Math.min(r_q-1, c_q-1);
        for (List<Integer> list : obstacles) {
            //top
            if (list.get(0) > r_q) {
                int r_diff = Math.abs(list.get(0) - r_q);
                int c_diff = Math.abs(list.get(1) - c_q);
                //top right
                if(list.get(1) > c_q && r_diff == c_diff) {
                    top_right = Math.min(top_right, c_diff - 1);
                } 
                //top left
                else if(list.get(1) < c_q && r_diff == c_diff) {
                    top_left = Math.min(top_left, c_diff - 1);
                }
                //top_mid
                 else if(list.get(1) == c_q) {
                    top_mid = Math.min(top_mid, r_diff - 1);
                }
            }
            //bot
            else if (list.get(0) < r_q) {
                int r_diff = Math.abs(list.get(0) - r_q);
                int c_diff = Math.abs(list.get(1) - c_q);
                //bot_right
                if(list.get(1) > c_q && r_diff == c_diff) {
                    bot_right = Math.min(bot_right, c_diff - 1);
                } 
                //bot_left
                else if(list.get(1) < c_q && r_diff == c_diff) {
                    bot_left = Math.min(bot_left, c_diff - 1);
                }
                //bot_mid
                 else if(list.get(1) == c_q) {
                    bot_mid = Math.min(bot_mid, r_diff - 1);
                }
            }
            //mid
            else {
                int diff = Math.abs(list.get(1) - c_q);
                //right
                if(list.get(1) > c_q) {
                    right = Math.min(right, diff - 1);
                } 
                //left
                else if(list.get(1) < c_q) {
                    left = Math.min(left, diff - 1);
                }
            }
        }
        result = top_mid + top_right + top_left
            + bot_mid + bot_right + bot_left
            + right + left;
        return result;
    }
}
