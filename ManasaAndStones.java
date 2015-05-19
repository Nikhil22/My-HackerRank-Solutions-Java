import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static void outcomes(int n, int a, int b){
        int sum = 0;
        int aTimes = 0;
        int bTimes = 0;
        if( a > b){
            bTimes = n-1; 
            aTimes = 0;
        }else if(a < b){
            aTimes = n-1;
            bTimes = 0;
        }else{
            sum = a *(n-1);
            System.out.print(sum);
        }
        
        int mostOccurances = Math.max(aTimes, bTimes);
        int leastOccurances = Math.min(aTimes, bTimes);
        int smallIncrement = Math.min(a,b);
        int largeIncrement = Math.max(a,b);
        while(mostOccurances >=0 || leastOccurances < n){
            sum = mostOccurances*smallIncrement + leastOccurances*largeIncrement;
            System.out.print(sum + " ");
            mostOccurances--;
            leastOccurances++; 
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
           outcomes(in.nextInt(), in.nextInt(), in.nextInt());
           System.out.println();
        }
    }
}
