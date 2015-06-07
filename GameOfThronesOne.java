import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	/*
	Step 1 - Loop through entire stirng
	Step 2 - Keep track of 3 variables ..(variables explained in step 4)
	Step 3 - put all characters occuring into a hashmap (Key: Character, Value: Number of Times Character Occurs In The String (integer value))
	Step 4 - 
		 numOnes - Number of characters in the string that only appear once
		 numOdd  - Number of characters in the string that appear an odd number of times
		 numEven - Number of characters in the string that appear an even number of times
	Step 5: If more than one character only appears once, the string CANNOT be rearranged to form a palindrome
		If numOdd <= numEven , the string can be rearranged to be a palindrome
		else, it cannot
		
	*/
    
    static String isAnagramOfPalindrome(String s){
        int numOdd = 0;
        int numEven = 0;
        int numOnes = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                
                if(numOnes >= 1 && map.get(s.charAt(i)) == 2){
                   numOnes--;
                }
                
            }else{
                map.put(s.charAt(i), 1);
                numOnes++;
                
            }
        }
        
        Collection collection = map.values();
        Iterator itr = collection.iterator();
        
        if(numOnes <=1){
            while(itr.hasNext()){
                if((int)itr.next() % 2 == 0){
                    numEven++;
                }else{
                    numOdd++;
                }
            }
            
            if(numOdd <= numEven){
                return "YES";
            }else{
                return "NO";
            }
        }else{
            return "NO";
        }
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagramOfPalindrome(in.nextLine()));
    }
}
