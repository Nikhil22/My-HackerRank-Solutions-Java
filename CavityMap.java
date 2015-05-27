import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
	Loop through the entire string; start at index 1 because we cannot have a cavity in the corner
	Keep track of the current character, the previous character, as well as the next character
	If the current character is greater than both the previous character and the next character,
	mark an 'X' in that index of the String, indicting a cavity 
	*/
    
    public static String cavity(String map){
        
        for(int i = 1; i < map.length() -1; i++){
            int current = Character.getNumericValue(map.charAt(i));
            int previous = Character.getNumericValue(map.charAt(i-1));
            int next = Character.getNumericValue(map.charAt(i+1));
            
            if(current > previous && current > next){
                map = map.substring(0,i) + 'X' + map.substring(i+1);
                i++; //because the next value cannot be a cavity (so skip to the next next value)
            }
        }
        return map;
    }
       

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(cavity(in.next()));
        }
       
    }
}
