import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String yesNo(int[] a){
        for(int i = 1; i < a.length; i++){
            if(a[i] != a[i-1]){
                for(int x = 2; x <= Math.min(a[i], a[i-1]); x++){
                    //if i divides both elements
                   if(Math.floor(a[i]/x) == a[i]/x && Math.floor(a[i-1]/x) == a[i-1]/x) {
                       return "NO";
                   }
                }
                
                return "YES";
            }
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N = 0;
        int[] input = new int[100];
        for(int i = 0; i < T; i++){
            N = in.nextInt();
            for(int x = 0; x < N; x++){
               input[x] = in.nextInt(); 
            }
            System.out.println(yesNo(input));
        }
    }
}
