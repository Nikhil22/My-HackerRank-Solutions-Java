import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
    2 inputs, num1 and num2
    Intialize your count variable (int count = 0)
    Step 1. Check if num1 >= num2.
        If true, loop while (num1 >= num2)
        Check if the square root of num2 is perfectly divisible by 1 (to see if it's an integer)
        If true, increment count
        For each loop, increment num2
    Step 2. If the condition in step 1 returned false...
        Do the exact same steps under Step 1, except replace num1 with num2 everywhere
    Step 3. Output the count 
    
    */

    static int sqNums(int num1, int num2){
        int count = 0;
        
        if(num1 >= num2){
            while(num1 >= num2){
                //checks if it's a square integer
                if(Math.sqrt(num2) % 1 == 0){
                    count++;
                }
                num2++;
            }
        }else{
           while(num1 <= num2){
                if(Math.sqrt(num1) % 1 == 0){
                    count++;
                }
                num1++;
            } 
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
           System.out.println(sqNums(in.nextInt(), in.nextInt())); 
        }
    }
}
