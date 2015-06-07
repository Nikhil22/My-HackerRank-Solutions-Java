import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    /*
    Initialize 2 variables
        int sum: Keeps track of the total sum
        int row: Keeps track of the current row in the 2D jars[][] array input
    Loop through the array
        For each row, we know the following:
        'a' and 'b' are indices of the jar (both inclusive)
        'a' is jars[row][0]
        'b' is jars[row][1]
        'k' or as I refer 'candiesToAdd' is jars[row][2]
        
        Therefore, update our sum value: (sum += (b - a + 1) * candiesToAdd)
    Once the loop is finished, output sum/N (average)
    */
    
    static int getSum(int[][] jars, int N){
        
        int sum = 0;
        int row = 0;
        while(row < jars.length){
            int index = 0;
            
                int a = jars[row][index];
                int b = jars[row][index + 1];
                int candiesToAdd = jars[row][index + 2];
                   
                sum += (b - a + 1) * candiesToAdd; 
            
            row++;
        }
        
        return sum/N;
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] ops = new int[M][3];
        
        for(int i = 0; i < M; i++){
            for(int x = 0; x < ops[i].length; x++){
                ops[i][x] = in.nextInt();
            }
        }
        
        System.out.print(getSum(ops, N));
    }
}
