import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        List<List<Integer>> s = new ArrayList<>();
        for (int i=0; i<3; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j=0; j<3; j++) {
                list.add(ip.nextInt());
            }
            s.add(list);
        }
        System.out.println(formingMagicSquare(s));
    }
    
    public static int formingMagicSquare(List<List<Integer>> s) {
        List<List<List<Integer>>> magicSquareList = new ArrayList<>();
        
        //add all magic square 3x3
        List<Integer> r = new ArrayList<>(Arrays.asList(8,1,6,3,5,7,4,9,2));
        magicSquareList.add(createMagicSquare(r));
        
        r = new ArrayList<>(Arrays.asList(6,1,8,7,5,3,2,9,4));
        magicSquareList.add(createMagicSquare(r));
        
        r = new ArrayList<>(Arrays.asList(4,9,2,3,5,7,8,1,6));
        magicSquareList.add(createMagicSquare(r));
        
        r = new ArrayList<>(Arrays.asList(2,9,4,7,5,3,6,1,8));
        magicSquareList.add(createMagicSquare(r));
        
        r = new ArrayList<>(Arrays.asList(8,3,4,1,5,9,6,7,2));
        magicSquareList.add(createMagicSquare(r));
        
        r = new ArrayList<>(Arrays.asList(4,3,8,9,5,1,2,7,6));
        magicSquareList.add(createMagicSquare(r));
        
        r = new ArrayList<>(Arrays.asList(6,7,2,1,5,9,8,3,4));
        magicSquareList.add(createMagicSquare(r));
        
        r = new ArrayList<>(Arrays.asList(2,7,6,9,5,1,4,3,8));
        magicSquareList.add(createMagicSquare(r));
        
        int minDiff = 50;
        for (int i = 0; i< magicSquareList.size(); i++){
            List<List<Integer>> magicSquare = magicSquareList.get(i);
            int diff = 0;
            for (int j = 0; j< 3; j++) {
                List<Integer> row = magicSquare.get(j);
                List<Integer> rowS = s.get(j);
                for (int k = 0; k< 3; k++) {                    
                    diff += Math.abs(rowS.get(k) - row.get(k));
                }
            }
            if (diff < minDiff) minDiff = diff;
        }
        return minDiff;
    }
    public static List<List<Integer>> createMagicSquare(List<Integer> list){
        List<Integer> row = new ArrayList<>();
        List<List<Integer>> matrix = new ArrayList<>();
        row.add(list.get(0));
        row.add(list.get(1));
        row.add(list.get(2));
        matrix.add(row);
        row = new ArrayList<>();
        row.add(list.get(3));
        row.add(list.get(4));
        row.add(list.get(5));
        matrix.add(row);
        row = new ArrayList<>();
        row.add(list.get(6));
        row.add(list.get(7));
        row.add(list.get(8));
        matrix.add(row);
        return matrix;
    }
}
