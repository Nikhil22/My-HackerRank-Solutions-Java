import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int min(int B, int W, int X, int Y, int Z){
        int min = 0;
        if(Z < Y || Z < X && Math.abs(X-Y) >= Z){
            if(X > Y){
                min = Y *(B+W) + Z*B;
            }else if(X < Y){
                min = X*(B+W) + Z*W;
            }
        }else{
            min = Y*W + B*X;
        }
        
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(min(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
}
