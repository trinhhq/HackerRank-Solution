import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        System.out.println(timeConversion(s));
    }
    
    public static String timeConversion(String s) {
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;
        try{
            date= df.parse(s);
            output = outputformat.format(date);
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        return output;
    }
}
