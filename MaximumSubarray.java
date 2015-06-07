import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
    Declare and initialize three variables: (int sum = 0, recoup = 0, nonContigSum = 0)
    Loop Through the array
    For each value in the array
	   Increment sum by array[index] IFF sum + array[index] >=0 (so that our sum doesn't become negative)
       
       Check if array[index] is negative
	       If true, the sum must be RECOUPERATED by at least that amount
		      recoup += Math.abs(array[index]);
	       If false
		      nonContigSum += arrray[index]
              Check if array[index] >= recoup
		          If true, recoup = 0;
                  else, recoup -= array[index]

    Once loop is finished, output (sum + recoup), as well as nonContigSum
    */
    
    public static void maxSubarray(int[] array){
        int sum = 0, recoup = 0, nonContigSum = 0;
      
        for(int i = 0; i < array.length; i++){
            if(sum + array[i] >= 0){
                sum += array[i]; 
            }
            if(array[i] < 0){
                recoup += Math.abs(array[i]);
            }
            else{
                nonContigSum += array[i];
                if(array[i] >= recoup){
                    recoup = 0;
                }else{
                    recoup -= array[i];
                }
            }
        }
        
        System.out.print(sum + recoup + " ");
        System.out.println(nonContigSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++){
            int N = in.nextInt();
            int [] array = new int[N];
            for(int x = 0; x < N; x++){
                array[x] = in.nextInt();
            }
            
            maxSubarray(array);
        }
        
        
    }
}
