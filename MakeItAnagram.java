import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	/*
	Take two strings are inputs: Call it string 'a' and string 'b'
	Keep track of the number of deletions needed - call it int 'deletions'
	Loop through string 'b'
	For each character in string 'b', check if string 'a' contains that character
	If string 'a' does not contain the character, increment deletions by 1
	Return deletions * 2 because for every character we delete from one string, we must delete oe from the other string
	*/
    
    static int deletions(String a, String b){
        int deletions = 0;
        
        
            for(int i = 0; i < b.length(); i++){
                if(!a.contains(String.valueOf(b.charAt(i)))){
                    deletions ++;
                }
            }
        
        
        return deletions * 2;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(deletions(in.next(), in.next()));
    }
}
