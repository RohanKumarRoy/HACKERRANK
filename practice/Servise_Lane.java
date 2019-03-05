import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int t=sc.nextInt();
       int width[]=new int[n];
       for(int p=0;p<n;p++)
          width[p]=sc.nextInt();
       while(t-->0)
       {  
           int min=3;
           int i=sc.nextInt();
           int j=sc.nextInt();
           for(int k=i;k<=j;k++)
           {
               if(width[k]<=min)
                min=width[k];
           }
           System.out.println(min);
       }
   }
}
