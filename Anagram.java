import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
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
