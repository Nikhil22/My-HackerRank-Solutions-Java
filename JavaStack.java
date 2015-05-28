import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	/*
	Loop through the entire string
	If the character in the string is a '{', '(' or '[', push it onto the stack
	If the character in the string is none of the above, then peek at the top of the stack
		If the top of the stack does NOT contain the matching opening bracket, (ie. '{' matches '}'), return false
		Else, pop it off the stack
	Once the string has been looped through, check if the stack is empty
	If the stack is empty, return true 
	Else, return false
	*/
    
    static boolean isBalanced(String string){
        Stack stack = new Stack();
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '{'
              || string.charAt(i) == '('
              || string.charAt(i) == '['){
                stack.push(new Character(string.charAt(i)));

            } else{ //IGT why you need an 'else' here
            
            if(!stack.empty()){  
            
                if(string.charAt(i) == '}'
                   && (char)stack.peek() != '{'){
                        return false;
                }else{
                    stack.pop();
                }
            }
            
            if(!stack.empty()){ 
            
                if(string.charAt(i) == ']'
                    && (char)stack.peek() != '['){
                        return false;
                }else{
                    stack.pop();
                }
            }
            
            if(!stack.empty()){ 
            
                if(string.charAt(i) == ')'
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
