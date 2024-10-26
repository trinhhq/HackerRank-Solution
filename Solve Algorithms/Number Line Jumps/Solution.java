import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x1 = ip.nextInt();
        int v1 = ip.nextInt();
        int x2 = ip.nextInt();
        int v2 = ip.nextInt();
        System.out.println(kangaroo(x1, v1, x2, v2));
    }
    
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 == x2 && v1 == v2)
            return "YES";
        else if ((v1-v2) == 0 || (x1-x2) == 0)
            return "NO";
        else if (((x2-x1) % (v1-v2) == 0) 
                    && ((x2-x1) * (v1-v2) > 0))
            return "YES";
        return "NO";
    }
}
