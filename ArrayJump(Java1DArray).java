import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String jumpAndWin(int[] a, int jumpLength){
        int i = 0;
        int stepBack;
        boolean lose = false;
        while(!lose){
               
            while(i < a.length -1 && a[i+1] != 1){
                i++;
            }
            
            if(i + jumpLength >= a.length){
                return "YES";
            }
        
            stepBack = 0;
            while(a[i + jumpLength - stepBack] != 0 && jumpLength > stepBack){
                stepBack++;
            }
            if(stepBack == jumpLength){
                lose = true;
            }
            i = i + jumpLength - stepBack; //jump and update our position
            
        }
        
        return "NO";
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] array = new int[n];
        
        for(int i = 0; i < T; i++){
            for(int x = 0; x < n; x++){
                array[x] = in.nextInt();
            }
            
            System.out.println(jumpAndWin(array, m));
        }
    }
}
