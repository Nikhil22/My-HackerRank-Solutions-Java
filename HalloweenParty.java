import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    	/*
	
	If there are an even number of cuts k, return (k/2) * (k/2)
	Otherwise, return ((k-1)/2) *((k-1)/2) + (k-1)/2
		
	*/
    
    static int maxChoc(int k){
        //base case
        if(k == 1){
            return 0;
        }
        if(k % 2 == 0){
            return (k/2) * (k/2);
        }else { 
            return ((k-1)/2) *((k-1)/2) + (k-1)/2;
        }
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(maxChoc(in.nextInt()));
        }
    }
}
