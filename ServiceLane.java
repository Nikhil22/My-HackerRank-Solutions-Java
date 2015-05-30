import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
	Call the input array 'a'
	For this challenge, we are simply required to find smallest number in the array between index i and j (both inclusive)
	Let's start off by assuming that the a[i] is the minimum (so, int min = a[i])
	Loop through the array starting at index i + 1, until index >= j
	For each element of the array, set min: min = Math.min(min, a[x]); This ensures we find the minimum number
	Output min
	*/
    
    static int largestVehicle(int[] a, int i, int j){
        int min = a[i];
        for(int x = i+1; x <=j; x++){
            min = Math.min(min, a[x]);
        }
        
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        int i = 0;
        int j = 0;
        int[] widthArray = new int[N];
        for(int x = 0; i < N; i++){
            widthArray[i] = in.nextInt();
        }
        for(int y = 0; y < T; y++){
            i = in.nextInt();
            j = in.nextInt();
            System.out.println(largestVehicle(widthArray, i, j));
        }
    }
}
