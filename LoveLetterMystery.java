import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
	Loop through the string - Start from the middle index(es) of the string (we will start our loop from here)
	Keep track of 3 variables:
		minOps = the minimum number of operations needed to convert the string to a palindrome
		startIndexLeft - keeps track of the index when looping through the LEFT half of the string (thus, decrement value as we loop)
		startIndexRight - keeps track of the index when looping through the RIGHT half of the string (thus, increment value as we loop)
	Loop through the string (while startIndexLeft >= 0, or startIndexRight <string.length)
	Keep track of the numerical values of the characters in the startIndexLeft & startIndexRight indexes
		leftCharVal - numerical value of character on the left side of the string, at index startIndexLeft
		rightCharVal - numerical value of character on the right side of the string, at index startIndexRight
	If the leftCharVal != rightCharVal, we must find the number of operations needed to make these values equal to each other
	Therefore, increment minOps by the absolute value of leftCharVal - rightCharValue
	
	*/
    
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
