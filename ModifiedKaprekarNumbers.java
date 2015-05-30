import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
    isKaprekar:
    1. 2 inputs: n, nSq
    2. n - the number (9, for exmaple)
    3. nSq - the square of n (81, for example)
    4. Loop through the string nSq
    5. Divide the string into a right half and a left half (if the length of nSq is odd, skip to step 9)
    6. Check if the integer value of the characters on the right half = integer value of the characters on the left half
    7. Also be weary that 0 is not a kaprekar number, as it is non-positive
    8. If yes to step 6, it is a kaprekar number 
    9. The right half could contain more OR less characters than the left side
        ie. (length = 3, number = 205, right half could be '2', OR '20')
    10. To account for both possibilities, we have our rCatch & lCatch
        rString assumes that the right side of the string is larger than the left side
            (ie,number = 205, right side = '20', left side = '5')
        rCatch assumes that the right side of the string is smaller than the left side
            (ie,number = 205, right side = '2', left side = '05')
         Therefore, lCatch assumes that the left side is larger. lString assumes that the left side is smaller
    11. Refer to step 6
    */
    
    static boolean isKaprekar(int n, int nSq){
        String nString = Integer.toString(n);
        String nSqString = Integer.toString(nSq);
        int numDigs = nString.length();
        int numSqDigs = nSqString.length();
        
        String rCatch = "";
        String lCatch = "";
        String lString = "";
        String rString = "";
        
        for(int i = 0; i < numSqDigs; i++){
            if(i < numDigs){
                if(i < numDigs -1){
                    rCatch = rCatch + nSqString.charAt(i);
                }
                rString = rString + nSqString.charAt(i);
            }
            
            if(i >= numDigs -1){
                if(i >= numDigs){
                   lString = lString + nSqString.charAt(i);
                }
                 
                lCatch = lCatch + nSqString.charAt(i); 
            }
        }
        
        int rSum = Integer.parseInt(rString);
        int lSum;
        if(lString.equals("")){
            lSum = 0;
        }else{
            lSum = Integer.parseInt(lString);
        }
        
        int rSumCatch;
        if(rCatch.equals("")){
            rSumCatch = 0;
        }else{
           rSumCatch = Integer.parseInt(rCatch); 
        }
        
        int lSumCatch = Integer.parseInt(lCatch);
        
        //acounts for 0's (as they are non positive integers)
        if(((rSum + lSum == n) && numSqDigs > 1 && lSum !=0) || ((rSum + lSum == n) && numSqDigs <= 1)
          || ((rSumCatch + lSumCatch == n) && numSqDigs > 1 && rSumCatch !=0) 
          || ((rSumCatch + lSumCatch == n) && numSqDigs <= 1)){
            return true;
        }else{
            return false;
        }
        
    }
     
    static void kaprekar(int p, int q){
        for(int i = p; i <= q; i++){
            if(isKaprekar(i, i*i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        kaprekar(in.nextInt(), in.nextInt());
    }
}
