import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
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
