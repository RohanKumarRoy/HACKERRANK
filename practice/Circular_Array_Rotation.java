import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int q=sc.nextInt();
    int r=k%n;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(int i=0;i<q;i++)
    {
      int index=sc.nextInt();
     if(index>=r)
      System.out.println(a[index-r]);
      else
      System.out.println(a[index-r+n]);
    }  
}
}
