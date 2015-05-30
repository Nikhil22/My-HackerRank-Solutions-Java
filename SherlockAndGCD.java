import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
    Step 1. It is easiest to solve this problem by simply determining if a subset B of length 2 exists
    Step 2. Loop through the array; Start at index 1
    Step 3. Check if the number at previous index == number at the current index (a[i] == a[i-1]?)
    Step 4. If they are not equal, proceed to step 5. If they are equal, return "NO"
    Step 5. Start a loop (that start at 2, and goes until it's less than or equal to the smaller of min[i], min[i-1])
    Step 6. For each number in this loop started above, check if the number (call it x) divides both a[i] and a[i -1]
    Step 7. If x divides both a[i] and a[i-1], return "NO"
    Step 8. The loop started in Step 5 completes (x does not divide BOTH a[i] and a[i-1]), return "YES"
    */
    
    static String yesNo(int[] a){
        for(int i = 1; i < a.length; i++){
            if(a[i] != a[i-1]){
                for(int x = 2; x <= Math.min(a[i], a[i-1]); x++){
                    //if i divides both elements
                   if(a[i] % x == 0 && a[i-1] % x == 0) {
                       return "NO";
                   }
                }
                
                return "YES";
            }
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N = 0;
        int[] input = new int[100];
        for(int i = 0; i < T; i++){
            N = in.nextInt();
            for(int x = 0; x < N; x++){
               input[x] = in.nextInt(); 
            }
            System.out.println(yesNo(input));
        }
    }
}
