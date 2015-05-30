import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
   /*
   Initialize three variables
   	int minOperations = 0; The minimum number of operations
   	int rightEnd = string.length() - 1 ... The index we start off at, at the very right (end) of the string
   	int leftEnd = string.length() - 1 ... The index we start off at, at the very left (beginning) of the string
   Loop through the string while (leftEnd < rightEnd)
   Initialize 2 variables inside the loop - Right at the beggining of the loop
   	rightVal - the numeric value of the character in the 'rightEnd' index of the string
   	leftVal - the numeric value of the character in the 'leftEnd' index of the string
   Increment minOperations by the absolute value of rightVal - leftVal
   Increment leftEnd and decrement rightEnd and 
   Once the loop is complete, output minOperations
   */
    
    static int minOps(String abc){
        int minOperations = 0;
        int rightEnd = abc.length() -1;
        int leftEnd = 0;
        
        while(leftEnd < rightEnd){
            int rightVal = Character.getNumericValue(abc.charAt(rightEnd));
            int leftVal = Character.getNumericValue(abc.charAt(leftEnd));
            minOperations += Math.abs(rightVal - leftVal);
            leftEnd++;
            rightEnd--;
        }
        
        return minOperations;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(minOps(in.next()));
        }
    }
}
