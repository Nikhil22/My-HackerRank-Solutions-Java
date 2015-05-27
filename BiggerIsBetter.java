import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    	/*
		
		int startEnd - The end index of the string that we start from
		int compareWith - the index in the array that holds the character that we will compare the character found in index 'startEnd' with
		Keep comparing until we reach the end of the string
		IF AT ANY POINT during the loops, the char in index 'startEnd' is lexicographically > than the char in index 'compareWith', return accordingly (refer to return statement in the code)
		
	    */
    
    static String biggerBetter(String abc){
        int startEnd = abc.length() -1; 
        int compareWith = startEnd - 1; 
        while(startEnd > 0){
            while(compareWith >= 0){
                
                if(Character.getNumericValue(abc.charAt(startEnd)) > Character.getNumericValue(abc.charAt(compareWith))){
                    return abc.substring(0, compareWith) + abc.substring(startEnd) + abc.substring(compareWith, startEnd);
                }
                
                compareWith--;
                
            }
            
            startEnd--;
            compareWith = startEnd -1;
        }
        
        return "no answer";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(biggerBetter(in.next()));
        }
    }
}
