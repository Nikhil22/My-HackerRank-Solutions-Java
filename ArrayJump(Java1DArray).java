import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
		
		Step 1: Advance as much as you can (AKA, increment index of array 'a' as long as a[index] =='0', -> keep advancing until the a[index + 1] is a '1')
		Step 2: Check whether we can just jump and win the game
		Step 3: If we can't win just yet, check how far we CAN jump (in other words, how far can we jump such that on our landing index, a[index] == 0)
		Step 4: If we have to take so many steps back that we have essentially NOT MOVED (stepBack == jumpLength) from our position (AKA can't jump) - WE ARE trapped - SO WE LOSE
		Step 5: Else, jump as far as we can, and increment our index.
		Step 6: Repeat steps 1-5 
		
	*/
    
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
