import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    	/*
		
	Loop through the arrivals array. 
	For each element in the array, if it's <=0, it implies that the particular student represented by that array element is on time
	Incremenent the number of students who showed up on time
	"NO" means the class should NOT be cancelled
	"YES" means the class SHOULD be cancelled
		
		
	*/
    
    public static String yesNo(int N, int K, int[] arrivals){
        int count = 0;
        for(int i =0; i< arrivals.length; i++){
            if(arrivals[i] <= 0){
                count++;
            }
        }
        
        if(count >= K){
            return "NO";
        }else{
            return "YES";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N = 0;
        int K = 0;
        for(int i = 0; i < T; i++){
            N = in.nextInt();
            K = in.nextInt();
            int[] arrivals = new int[N];
            for(int x = 0; x < N; x++){
               
               arrivals[x] = in.nextInt(); 
            }
            
            System.out.println(yesNo(N, K, arrivals));
        }
    }
}
