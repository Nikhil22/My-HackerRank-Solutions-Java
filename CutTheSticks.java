import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    	/*
	
	Sort the array so that the smallest elements are at the front
	Keep track of the minimum (should be array[0] since it has been sorted)	
	Loop through the array, and subtract the minimum from each element of the array
	Keep track of the number of 0's that result from this subtraction
	If the result of thr subtraction is NOT == 0, this indicates we have reached a value higher than our minimum
	Thus, assign this new value to the minimum.
	Repeat this process until the entire array has been looped through 
	
	*/
    
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
