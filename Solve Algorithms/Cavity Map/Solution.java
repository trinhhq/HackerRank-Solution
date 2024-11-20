import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        List<String> grid = new ArrayList<>();
        for (int i=0; i<n; i++) {
            grid.add(ip.nextLine());
        }
        cavityMap(grid, n);
    }
    
    public static void cavityMap(List<String> grid, int n) {
    
        System.out.println(grid.get(0));
        for (int i = 1; i < n-1; i++) {
            String tempStr = grid.get(i);
            System.out.print(tempStr.charAt(0));
            for (int j = 1; j < n-1; j++) {
                String postString = grid.get(i+1);
                String prevString = grid.get(i-1);
                char tmpChar = tempStr.charAt(j);
                if (tempStr.charAt(j-1) < tmpChar
                    && tempStr.charAt(j+1) < tmpChar
                    && postString.charAt(j) < tmpChar
                    && prevString.charAt(j) < tmpChar) {
                        System.out.print("X");
                } else {
                    System.out.print(tempStr.charAt(j));
                }
            }
            System.out.print(tempStr.charAt(n-1));
            System.out.println();
        }
        if (n>1) {
            System.out.println(grid.get(n-1));
        }
    }
}
