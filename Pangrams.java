import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
	Create a string that contains every letter of the alphabet
	Convert our input string 's' to lower case so that we don't have to worry about case sensitivity 
	Loop through the alphabet string
	For each letter of the alphabet string , check if 's' contains that letter
	If 's' does not contain the letter, 's' is NOT a pangram
	If loop is finished and 's' contained all letters of the alphabet, 's' is a pangram
	*/
    
    static void isPangram(String s){
      String abc = "abcdefghijklmnopqrstuvwxyz";
      String sLowerCase = s.toLowerCase();
      boolean isPan = true;
      int index = 0;
      while(index < abc.length() & isPan){
          if(sLowerCase.indexOf(abc.charAt(index)) == -1){
              isPan = false;
          } 
          index++;
      }
        
        if(isPan){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
      
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        isPangram(in.nextLine());
        
    }
}
