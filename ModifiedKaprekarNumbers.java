import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
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
