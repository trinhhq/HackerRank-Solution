import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        List<Integer> grades = new ArrayList<>();
        for (int i=0; i<n; i++) {
            grades.add(ip.nextInt());
        }
        printArray(gradingStudents(grades));
    }
    
    public static void printArray(List<Integer> arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
        int tmp = 0;
        for (int i = 0; i< grades.size(); i++) {
            if (grades.get(i) > 37) {
                tmp = grades.get(i);
                if (tmp % 5 > 2) {
                    tmp+= 5 - tmp%5;
                    grades.set(i, tmp);
                }
            }
        }
        return grades;
    }
}
