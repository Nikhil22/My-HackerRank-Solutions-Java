import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*; 
import java.util.regex.*;


public class Solution {
    
    static String isFibo(int x){
        int n = x - 1;
        int nMinusOne = 1;
        
        while ((n - nMinusOne) > nMinusOne){
            n--;
            nMinusOne++;
        }
        
        //assuming that it's fibo (for now)...
        int nMinusTwo = n - nMinusOne;
        while(nMinusTwo >0){
            int temp = nMinusTwo; 
            nMinusTwo = nMinusOne - nMinusTwo;
            nMinusOne = temp;
        }
        
        if(nMinusTwo == 0){
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
