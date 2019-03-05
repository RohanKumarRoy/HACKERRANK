import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int z=sc.nextInt();
      int[] students=new int[z];
        
       for(int i=0;i<z;i++)
       {
           students[i]=sc.nextInt();
            
       }
        int n=0,m=0,rem=0;
    for(int i=0;i<z;i++)
    {   
     if(students[i]<38)
     {
         System.out.println(students[i]);
     }
      else{
          rem=students[i]%5;
          if(rem==1 ||rem==2 ||rem==6 ||rem==7 ||rem==0)
          {
              System.out.println(students[i]);
          }
          else{
              n=students[i]+(5-rem);
              System.out.println(n);
          }
      }  
          
    }
    }
}
