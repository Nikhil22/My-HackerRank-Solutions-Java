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
   Increment minOperations by the absolute value of the character at the index 'rightEnd' - the character at the index 'leftEnd'
   Increment leftEnd and decrement rightEnd 
   Once the loop is complete, output minOperations
   */
    
    static int minOps(String abc){
        int minOperations = 0;
        int rightEnd = abc.length() -1;
        int leftEnd = 0;
        
        while(leftEnd < rightEnd){
            minOperations += Math.abs(abc.charAt(rightEnd) - abc.charAt(leftEnd));
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
