import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
    Keep track of 5 variables
        sum - our total sum
        mostOccurances - The maximum number of times a particular number (other than 0) can occur on a stone
        leastOccurances - The minimum number of times a particular number (other than 0) can occur on a stone
        largeIncrement - The larger of the 2 numbers (a, b) that we must increment our sum by
        smallIncrement - The smaller of the 2 numbers (a, b) that we must increment our sum by
    Since we must print all possible sums in ASCENDING order...
    Start off with the smallest possible sum; That is, if ALL the rocks contained the smaller of a & b
    Loop while mostOccurances >=0 or leastOccurances < n
    Print out the sum: mostOccurances*smallIncrement + leastOccurances*largeIncrement
    Decrement mostOccurances and increment leastOccurances (so that the sum gets gradually larger)
    */
    
    static void outcomes(int n, int a, int b){
        int sum = 0;
        
        //base case
        if(a == b){
            sum = a *(n-1);
            System.out.print(sum);
        }
        
        int mostOccurances = n-1;
        int leastOccurances = 0;
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
