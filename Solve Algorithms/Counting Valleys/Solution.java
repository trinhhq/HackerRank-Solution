import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        String path = ip.nextLine();
        System.out.println(countingValleys(n, path));
    }
    
    public static int countingValleys(int steps, String path) {
        int result = 0;
        int countCheck = 0;
        boolean valleyCheck = false;
        
        for (int i = 0; i< steps; i++) {
            if (path.charAt(i) == 'D') {
                countCheck--;
            } else {
                countCheck++;
            }
            if (countCheck < 0) {
                valleyCheck = true;
            } else if (countCheck > 0) {
                valleyCheck = false;
            } else if(valleyCheck == true){
                result++;
            }
        }
        return result;
    }
}
