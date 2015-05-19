import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    final static int sh = 1;
public static void main(String[] args){
    present(); 
}
    public static int getHeight(int cycles){
        int height = 1;
        //base cases
        if(cycles == 1){
            return sh*2;
        }else if(cycles == 2){
            return sh*2 +1;
        }else if(cycles == 0){
            return sh;
        }
        
        for(int i = 1; i <=cycles; i++){
            if(i % 2 != 0){ //if odd, then spring
                height = height *2;
            }else if(i % 2 == 0){
                height = height +1;
            }
        }
        
        return height; 
        
    }
    
    public static void present(){
        Scanner in = new Scanner(System.in);
        int t;
        t= in.nextInt(); //number of test cases
        int cycles = 0;
        int b;
        
        for(int i = 0; i < t; i++){
            cycles = in.nextInt();
            System.out.println(getHeight(cycles));
        }
    }
}
