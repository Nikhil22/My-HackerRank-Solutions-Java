import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int lonelyInt(int[] a) {
        
        Arrays.sort(a);
    
    int current = a[0];
    int count = 0;
    
    for(int i = 0; i < a.length; i++){
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
                count = 0;
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

