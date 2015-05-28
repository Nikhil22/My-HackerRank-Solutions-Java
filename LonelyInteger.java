import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
    Sort the array; This way, it's easier to determine the number of times a number appears
    Initialize a counter
    Loop through the array
    Keep track of your current value  
    Count the number of times each number occurs
    If you encounter a new number in the array, check if the counter for the previous number is odd/even
    If the counter is an odd number, return the previous number (the number which is associated with the counter)
    If the counter is even, check if we are in the last element of the array
    If we are, return that number (it's got to be the only odd occuring number in the array in this case)
    If we are not, reset the counter to 1 (1 b/c we have one occurance of the new number)
    Reassign the current value to the new value
    */
    
static int lonelyInt(int[] a) {
        
    Arrays.sort(a);
    
    int current = a[0];
    int count = 0;
    
    for(int i = 0; i < a.length; i++){
        //base case
        if(a.length == 1){
            return a[0];
        }
        if(a[i] == current){
           current = a[i];
           count++;
        }else{
            if(count % 2 != 0){
                return a[i];
            }else if(i != a.length -1){
                count = 1;
                current = a[i];
                
            }else{
                return a[i];
            }
        } 
    }
    
    return -1;

    }
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    int[] a = new int[T];
    for(int i = 0; i < T; i++){
        
        a[i] = in.nextInt();
    }
    System.out.println(lonelyInt(a));
    }
}



