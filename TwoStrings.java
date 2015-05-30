import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
    boolean isCommon - Is the particular character common between both strings (string a, string b)
    */
    
    static String commonString(String a, String b){
        boolean isCommon = false;
        int index = 0;
        while(!isCommon && index <b.length()){
           
                if(a.contains(String.valueOf(b.charAt(index)))){
                    isCommon = true;
                }
            index++;
        }
        
        if(isCommon){
            return "YES";
        }else{
           return "NO"; 
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++){
            System.out.println(commonString(in.next(), in.next()));
        }
    }
}
