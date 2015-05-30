import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	static int maxXor(int a, int b){
       int max =0;
       
       while(a <= b){
           int j = a;
           while(j <= b){
               int xor = a ^ j;
               max = Math.max(xor, max);
               j++;
           }
            a++;
       } 
        
        return max;
       
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(maxXor(in.nextInt(), in.nextInt()));
        
    }
}
