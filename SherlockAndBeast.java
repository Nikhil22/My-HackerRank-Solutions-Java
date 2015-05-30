import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    
    /*
    Let input = 'num'
    Step 1: Check if the num is divisible by 3. If so, print 'num' number of 5's
    If the above 'if' statement did not return true, proceed to step 2...
    Step 2: Check how many 3's (represented by int num3) can go into 'num' by working backwards (to ensure that we can still print out 5's if possible). To do this, loop while (num - num3) % 3 !=0. Increment num3
    This way, loop exits as soon as num - num3 is no longer divisible by 3, which possibly leaves us room to check if we can print out some 5's
    Step 3: If num-num3 is divisible by 3, print (num-num3) number of 5's
            Then print num3 number of 3's
    Step 4: If the above 'if' statement did not return true, check if num is divisible by 5
            If true, print num3 number of 3's
    Step 5: If the above 'if' statement (step 4) did not return true, there is no solution
    */
    
	static void fiveThree(int num){
		if(num % 3 == 0){
			for(int i = 0; i < num; i++){
				System.out.print(5);
			}
		}else {
			int num3 = 5; //number of 3's (a multiple of 5)
            
			while((num - num3) % 3 != 0 && (num - num3) > 0){
				num3 = num3 + 5;
			}
                       
            if((num - num3) % 3 == 0 && (num - num3) != 0){
                for(int i = 0; i < num; i++){
                   if(i < num - num3){
                      System.out.print(5); 
                   }else{
                      System.out.print(3); 
                   }
				
                }
            }else if(num % 5 == 0){
                for(int i = 0; i < num3; i++){
                    System.out.print(3);
                }
            }
            else{
		   System.out.print(-1);
		}

	  }
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 0; i < T; i++){
			fiveThree(in.nextInt());
			System.out.println();
		}
	}
	
}
