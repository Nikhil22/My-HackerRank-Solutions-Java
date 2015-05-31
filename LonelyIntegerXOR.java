import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
    Alternative solution to Lonely Integer using the XOR (exlusive or) operator. 
    Also see my original solution titled 'LonelyInteger.java' under My-HackerRank-Solutions-Java
    */
    
static int lonelyInt(int[] a) {
        
        int lonelyInteger = 0;
        for(int i = 0; i < a.length; i++){
            
           lonelyInteger ^= a[i];   
        }
        
        return lonelyInteger;

    }
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    int[] a = new int[T];
    for(int i = 0; i < T; i++){
        
        a[i] = in.nextInt();
    }
    System.out.println(lonelyInt(a));
    }
}
