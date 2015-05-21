import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funny(String S){
        int startS = 1;
        int startR = S.length() - 2;
        boolean isEqual = true;
        
        while(startS < S.length() && isEqual){
            int s = Math.abs(S.charAt(startS) - S.charAt(startS - 1));
            int r = Math.abs(S.charAt(startR) - S.charAt(startR + 1));
            
            if(s !=r){
                isEqual = false;
            }
            startS++;
            startR--;
        }
        
        if(isEqual){
            return "Funny";
        }else{
            return "Not Funny";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(funny(in.next()));
        }
    }
}
