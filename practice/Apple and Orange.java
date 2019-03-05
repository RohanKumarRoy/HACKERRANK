import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args)
    {  int count=0; 
     int cou=0; 
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int[] r=new int[m];
        int[] o=new int[n];
        
        for(int i=0;i<m;i++)
        {
            r[i]=sc.nextInt();
            if(a+r[i]>=s && a+r[i]<=t)
                count++;
        }
     for(int i=0;i<n;i++)
        {
            o[i]=sc.nextInt();
            if(s<=b+o[i] && b+o[i]<=t)
                cou++;
        }
     System.out.print(count);
     System.out.println();
     System.out.println(cou);
    }
    
}
