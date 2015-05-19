import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sqNums(int num1, int num2){
        int count = 0;
        //base case
        if(num1 == num2 && Math.floor(Math.sqrt(num1)) == Math.sqrt(num1)){
            count++;
        }
        
        if(num1 > num2){
            while(num1 >= num2){
                //checks if it's a square integer
                if(Math.floor(Math.sqrt(num2)) == Math.sqrt(num2)){
                    count++;
                }
                num2++;
            }
        }else{
           while(num1 <= num2){
                if(Math.floor(Math.sqrt(num1)) == Math.sqrt(num1)){
                    count++;
                }
                num1++;
            } 
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
           System.out.println(sqNums(in.nextInt(), in.nextInt())); 
        }
    }
}
