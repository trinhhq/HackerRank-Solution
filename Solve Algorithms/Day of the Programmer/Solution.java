import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int year = ip.nextInt();
        System.out.println(dayOfProgrammer(year));
    }
    
    public static String dayOfProgrammer(int year) {
        //13.09.2017
        String result ="";
        if (year == 1918){
            result = "26.09.1918";
        } else if((year < 1918 && (year % 400 == 0 || year % 4 == 0))
                || (year > 1918 && 
                    (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
            result = "12.09." + String.valueOf(year);
        } else {
            result = "13.09." + String.valueOf(year);
        }
        return result;
    }
}
