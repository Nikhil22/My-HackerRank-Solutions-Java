//Game of Thrones 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String isAnagramOfPalindrome(String s){
        int numOdd = 0;
        int numEven = 0;
        int numOnes = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                
                if(numOnes >= 1){
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
