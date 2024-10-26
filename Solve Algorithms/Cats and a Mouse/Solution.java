import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int q = ip.nextInt();
        for (int i=0; i<q; i++) {
            int x = ip.nextInt();
            int y = ip.nextInt();
            int z = ip.nextInt();
            System.out.println(catAndMouse(x,y,z));
        }
    }
    
    public static String catAndMouse(int x, int y, int z) {
        if (Math.abs(x-z) == Math.abs(y-z)) {
            return "Mouse C";
        } else if (Math.abs(x-z) > Math.abs(y-z)){
            return "Cat B";
        } else {
            return "Cat A";   
        }

    }
}
