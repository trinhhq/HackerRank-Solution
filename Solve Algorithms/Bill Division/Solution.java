import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        List<Integer> bill = new ArrayList<>();
        for (int i=0; i<n; i++) {
            bill.add(ip.nextInt());
        }
        int b = ip.nextInt();
        bonAppetit(bill, k, b);
    }
    
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int actualPay = 0;
        for (int i = 0; i< bill.size(); i++) {
            if (i != k) actualPay+= bill.get(i);
        }
        if(actualPay/2 == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b-actualPay/2);
        }
    }
}
