import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	/*NOTE* The following algorithm is without the use of the xor operator (^). 
	For my solution to this problem using the xor operator, see 'MaximizingXor.java' under 
	'My-HackerRank-Solutions-java' */
	
	/*
	Pseudocode for xor() method 
	1. Convert integer inputs a and b into binary strings aBin and bBin
	2. Declare a string: String xor = ""; This will hold our binary xor string 
	3. Declare two integers, longer and smaller
	
	*NOTE* Steps 4 & 5 are not necessary. It just makes the code easier to read
		
	4. Set 'longer' equal to bBin.length()
	5. Set 'smaller' equal to aBin.length();
	
    *NOTE* For steps 6-9, it helps to visualize: Here's a following example
    
    bBin = 1101
    aBin = 10
    
    We must compare them as such : 1101
                                     10
                              xor: 1111
    
    
	6. Loop through bBin
	7. For each character in bBin, check if the current index is < (longer - smaller)
        If true, check if bBin.charAt(i) == '1' 
		  If true, append our xor string: xor = xor + "1"
		  If false, append our xor string: xor = xor + "0"
	8. If the condition in step 10 is false,
		Check if bBin.charAt(i) and aBin.charAt(i - (longer - smaller)) satisfy the XOR conditions
		If true, append our xor string: xor = xor + "1"
		If false, append our xor string: xor = xor + "0"
	9. Finish the loop and output the integer version (base 10) of the xor string
	*/
    

    static int xor(int a, int b){
        String aBin = Integer.toBinaryString(a); 
        String bBin = Integer.toBinaryString(b);  
		
        int longer = bBin.length(); 
        int smaller = aBin.length();
        
        String xor = "";

            for(int i = 0; i < longer; i++){ 
                if(i < (longer - smaller)){ 
                    if(bBin.charAt(i) == '1'){
                        xor = xor + "1"; 
                    }else{
                        xor = xor + "0";
                    }
                }else {
					
					if((bBin.charAt(i) == '1' && aBin.charAt(i - (longer - smaller)) == '0') 
                   		|| (bBin.charAt(i) == '0' && aBin.charAt(i - (longer - smaller)) == '1')){
                    
                    		xor = xor + "1";                    
                		}else{
                    		xor = xor + "0";
                		}
				}
            }
        
        return Integer.parseInt(xor, 2); 
    }
    
    static int MaxXor(int a, int b){
        int maxXor = 0;
        int min = Math.min(a,b); 
        int max = Math.max(a,b); 
        
        while(min <= max){ 
           
            int n = 0;
            while((min + n) <= max){ 
                maxXor = Math.max(maxXor, xor(min, (min + n)));
                n++;
            }
            
             min++;
        }
        
        return maxXor;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(MaxXor(in.nextInt(), in.nextInt()));
        
    }
}
