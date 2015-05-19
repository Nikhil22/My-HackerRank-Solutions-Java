import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	static void fiveThree(int num){
		if(num % 3 == 0){
			for(int i = 0; i < num; i++){
				System.out.print(5);
			}
		}else {
			int num3 = 0;
			while((num - (5 + num3)) % 3 != 0 && (num - (5+num3)) >= 0){
				num3 = num3 + 5;
			}
            
            
            if((num - (num3 + 5)) % 3 == 0 && (num - (num3 + 5)) != 0){
                for(int i = 0; i < (num - (num3 + 5)); i++){
				System.out.print(5);
                }
            }
			
			
			if((num - num3 -5) % 5 == 0 || (num - num3 -5) % 3 == 0){
				for(int i = 0; i < (num3 + 5); i++){
					System.out.print(3);
				}
			}else{
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
