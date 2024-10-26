import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        List<Integer> h = new ArrayList<>();
        for (int i=0; i<26; i++) {
            h.add(ip.nextInt());
        }
        ip.nextLine();
        String word = ip.nextLine();
        System.out.println(designerPdfViewer(h, word));
    }
    
    public static int designerPdfViewer(List<Integer> h, String word) {
        int max = 0;
        for (int i = 0; i< word.length(); i++) {
            int asciiChar = (int)word.charAt(i);
            max = Math.max(max, h.get(asciiChar-97));
        }
        return max*word.length();
    }
}
