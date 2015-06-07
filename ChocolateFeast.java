import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
	Start off by buying as many chocolates as you can
	Keep track of the number of chocolates as well as the number of wrappers you have
	The number of wrappers you have must initially equal the number of chocolates you have (or ate)
	Loop while you have at least as many wrappers needed for a voucher for a free chocolate
		Increment number of total chocolates; also increment wrappers for each loop
	*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        
        int numChocs = N/C;
        int wrappers = numChocs;
        
        while(wrappers >= M){
            wrappers = wrappers - M;
            numChocs++;
            wrappers++;
        }
        
        return numChocs;
    }
    
    
}
