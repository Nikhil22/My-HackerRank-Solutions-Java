import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
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
