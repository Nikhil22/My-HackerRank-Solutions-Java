import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static void stix(int[] a){
        int cuts = a.length;
        System.out.println(cuts);
        int zeros = 0;
        Arrays.sort(a);
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] - min == 0){
               zeros++;
               
            }else{
                min = a[i];
                System.out.println(cuts - zeros);
                zeros++;
            }
            
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] a = new int[T];
        
        for(int i = 0; i<T; i++){
           a[i] = in.nextInt(); 
        }
        
        stix(a);
    }
}
