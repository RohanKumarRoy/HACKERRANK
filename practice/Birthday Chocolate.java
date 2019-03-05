import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
  public static void main(String []args)
  {
   int sum=0,result=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s[]=new int[n];
    for(int i=0;i<n;i++)
     s[i]=sc.nextInt();
     int d=sc.nextInt();
     int m=sc.nextInt();

     for(int i=0;i<n;i++)
     { 
       for(int j=0;j<m;j++)
       {  if(i+j<n)
         sum=sum+s[i+j];
         else
         break;
       }
        
       if(sum==d)
         result++;
        sum=0; 
     }
     System.out.println(result);   
  }
} 

