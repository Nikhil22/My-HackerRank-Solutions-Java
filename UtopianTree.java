import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Solution {
        
    /*
    Establish the base case (shown below)
    int cycles - the number of growth cycles
    int height - starting height (starts off at 1)
    Loop starting from int i = 1 until i is less than or equal to 'cycles'
    If i is odd then we are in spring, so height = height * 2
    If i is even then we are in summer, so height = height + 1
    Output height once the loop is complete
    */
        
    public static int getHeight(int cycles){
        int height = 1;
        
        //base case
        if(cycles == 0){
            return height;
        }
        
        for(int i = 1; i <=cycles; i++){
            if(i % 2 != 0){ 
                height = height *2;
            }else if(i % 2 == 0){
                height = height +1;
            }
        }
        
        return height; 
        
    }
        
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++){
            int cycles = in.nextInt();
            System.out.println(getHeight(cycles));
        }
    }
}
