import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String cavity(String map){
        //starts at 1 because can't have a cavity at the corner + we avoid the array out of bounds exception
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
