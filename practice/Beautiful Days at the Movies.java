import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        
       //int n= j-i+1;
        int count=0;
           
        while(i<=j){
        int number= i;
        int reverse= 0;
        
             while(number!= 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
             } 
            int diff= Math.abs(i-reverse);
           if(diff % k==0||diff==0){
                count++;
                    }
        i++;
        }
      System.out.println(count); 
    }
 
}
