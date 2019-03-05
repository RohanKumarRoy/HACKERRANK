import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{

public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
    int z=sc.nextInt();
    int[] a=new int[z];
    int max=0;
    for(int i=0;i<z;i++)
    {
        a[i]=sc.nextInt();
        if(max<a[i])
       {
           max=a[i];
          
       }
    }
    
    int count=0;
   for(int i=0;i<z;i++)
   {
      if(max==a[i])
        count++;  
   }
    
    System.out.print(count);
    
}
}


    
