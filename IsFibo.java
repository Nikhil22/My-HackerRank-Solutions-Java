import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*; 
import java.util.regex.*;


public class Solution {
	
	/*
	Step 1: Find 2 numbers (call them int n, nLess) that sum to our input x, 
		such that it makes sense in a fibonacci sense - What do I mean by that?...
		The difference between n and nLess cannot greater than nLess (to satisfy fibonacci sequence)
		To do this, loop while (n - nLess > nLess)
			For each loop, decrement n and increment nLess
		So we now have a seqeunce nLess, n, x  which satisfy fibo incremental conditions (may not be fibo, though)
	Step 2: Now it's easy to find the number that comes before nLess (call it nEvenLess)
		While nEvenLess > 0, decrement the values of nLess and nEvenLess such that they satisfy the fibo sequence
	Step 3: If nEvenLess == 0, return "IsFibo" since 0 is the first number in the fibonacci sequence
		else, return "IsNotFibo"
			
	*/
    
    static String isFibo(int x){
        int n = x - 1;
        int nLess = 1;
        
        while ((n - nLess) > nLess){
            n--;
            nLess++;
        }
        
        
        int nEvenLess = n - nLess;
        while(nEvenLess >0){
            int temp = nEvenLess; 
            nEvenLess = nLess - nEvenLess;
            nLess = temp;
        }
        
        if(nEvenLess == 0){
            return "IsFibo";
        }else{
            return "IsNotFibo";
        }
    }    
    


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(isFibo(in.nextInt()));
        }
    }  
        
}
