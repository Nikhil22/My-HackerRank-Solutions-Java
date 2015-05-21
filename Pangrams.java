import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
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
