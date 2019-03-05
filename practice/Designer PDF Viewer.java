import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
 public class pdf
 {
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int h[]=new int[26];
         for(int i=0;i<26;i++)
         h[i]=sc.nextInt();

         String word=sc.next();
   int max=0;
         for(int i=0;i<word.length();i++)
         {
             int loc=word.charAt(i)-97;
             int temp=h[loc];
             if(max<temp)
               max=temp;
         }
         System.out.println(max*word.length());
     }
 }