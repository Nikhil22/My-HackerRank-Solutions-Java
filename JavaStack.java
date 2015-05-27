import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static boolean isBalanced(String paranthesis){
        Stack stack = new Stack();
        for(int i = 0; i < paranthesis.length(); i++){
            if(paranthesis.charAt(i) == '{'
              || paranthesis.charAt(i) == '('
              || paranthesis.charAt(i) == '['){
                stack.push(new Character(paranthesis.charAt(i)));

            } else{ //IGT why you need an 'else' here
            
            if(!stack.empty()){  
            
                if(paranthesis.charAt(i) == '}'
                   && (char)stack.peek() != '{'){
                        return false;
                }else{
                    stack.pop();
                }
            }
            
            if(!stack.empty()){ 
            
                if(paranthesis.charAt(i) == ']'
                    && (char)stack.peek() != '['){
                        return false;
                }else{
                    stack.pop();
                }
            }
            
            if(!stack.empty()){ 
            
                if(paranthesis.charAt(i) == ')'
                    && (char)stack.peek() != '('){
                        return false;
                }else{
                    stack.pop();
                }
            
            }
            } 
        }
        
        if(!stack.empty()){
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            System.out.println(isBalanced(in.nextLine()));
        }
        
    }
}
