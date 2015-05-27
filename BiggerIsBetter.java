import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
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
