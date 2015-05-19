
import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static void minUnfairness(int group, int[] list){
        Arrays.sort(list);
        
        int unfairness = Integer.MAX_VALUE;
        int indexEnd = 0;
        
        
           for(int i = 0; i < group -1 + i; i++){
               if((group - 1 + i) < list.length){
                   if(unfairness > list[group -1 + i] - list[i]){
                    unfairness = list[group -1 + i] - list[i];
                    indexEnd = group -1 + i;
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
