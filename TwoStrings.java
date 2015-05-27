import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String commonString(String a, String b){
        boolean common = false;
        int i = 0;
        while(!common && i <b.length()){
           
                if(a.contains(String.valueOf(b.charAt(i)))){
                    common = true;
                }
            i++;
        }
        
        if(common){
            return "YES";
        }else{
           return "NO"; 
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++){
            System.out.println(commonString(in.next(), in.next()));
        }
    }
}
