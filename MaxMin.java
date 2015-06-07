import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
    Call the length of the subarray 'group'
    Set 'unfairness' to the highest possible integer value (Integer.MAX_VALUE)
    Sort the array
    Loop through the array BUT..
    Start at index 0, and loop till index group -1 + i
    Check if group -1 + i < the array length (to see if we have a new max/min to compare)
    If so, check if the current unfairness > (max number in the group - min number in the group)
    If so, set unfairness to that value (so, unfairness = list[group -1 + i] - list[i])
    Output 'unfairness' when the array has been fully looped through
    
    */
    
    static void minUnfairness(int group, int[] list){
        Arrays.sort(list);
        
        int unfairness = Integer.MAX_VALUE;       
        
           for(int i = 0; i < group -1 + i; i++){
               if((group - 1 + i) < list.length){
                   if(unfairness > list[group -1 + i] - list[i]){
                    unfairness = list[group -1 + i] - list[i];
                    } 
               }
            
            } 
        
        System.out.print(unfairness);
        
        
    }
    
   public static void main(String[] args)  {
    
       Scanner in = new Scanner(System.in);
       int N = in.nextInt();
       int K = in.nextInt();
       int[] list = new int[N];
       for(int i = 0; i < N; i++){
          list[i] = in.nextInt(); 
       }
       
       minUnfairness(K, list); 
     
    }   
}

