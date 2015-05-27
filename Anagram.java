import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
		
		Divides the string into two parts
		For each character in the left half of the string, check if the right half contains it
		If the right half does not contain, incrememnt the number of replacements needed by 1
		
	*/
    
    static int anagram(String abc){
        if(abc.length() % 2 == 0){
            int replacements = 0;
            for(int i = 0; i < abc.length() /2; i++){
               if(!abc.substring(abc.length()/2).contains(String.valueOf(abc.charAt(i)))){
                  replacements++; 
               } 
            }
            
            return replacements;
            
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(anagram(in.next()));
        }
    }
}
