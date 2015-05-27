import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	/*
	Convert the input integer to a string
	Initialize a counter
	Loop through the string
	For each character, check if it's numericValue evenly divides our integer input (and that it's not a 0)
	If the numeric value of character in the string DOES divide our integer input , increment our counter
	*/
    
    static int numDigitsDivide(int N){
        String candidate = Integer.toString(N);
        int count = 0;
        
        for(int i = 0; i < candidate.length(); i++){
            int num = Character.getNumericValue(candidate.charAt(i));
            if(num !=0 && N % num ==0){
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(numDigitsDivide(in.nextInt()));
        }
    }
}
