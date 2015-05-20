import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int minOperations(String abc){
        int minOps = 0;
        int startIndexLeft = 0;
        int startIndexRight = 0;
        if(abc.length() % 2 == 0 && abc.length() >= 2){
            startIndexLeft = (abc.length())/2 - 1;
            startIndexRight = startIndexLeft + 1;
            
   
            //check if the starting two middle points are equal (to ensure palindrome)
            if(Character.getNumericValue(abc.charAt(startIndexLeft)) != Character.getNumericValue(abc.charAt(startIndexRight))){
                minOps += Math.abs(Character.getNumericValue(abc.charAt(startIndexLeft)) - Character.getNumericValue(abc.charAt(startIndexRight)));
                startIndexLeft--;
                startIndexRight++;
            }
                while(startIndexLeft >= 0){
                   minOps += Math.abs(Character.getNumericValue(abc.charAt(startIndexLeft)) - Character.getNumericValue(abc.charAt(startIndexRight)));
                    
                    startIndexLeft--;
                    startIndexRight++;
                }
           
        }else if(abc.length() % 2 != 0 && abc.length() >= 2){
            startIndexLeft = (abc.length() -1)/2 -1;
            startIndexRight = (abc.length() -1)/2 +1;
            
            while(startIndexLeft >= 0){
                    minOps += Math.abs(Character.getNumericValue(abc.charAt(startIndexLeft)) - Character.getNumericValue(abc.charAt(startIndexRight)));
                    startIndexLeft--;
                    startIndexRight++;
                }
        
        }
        
       return minOps;
       
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            String abc = in.next();
            System.out.println(minOperations(abc));
        }
    }
}
