import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
          for(int j=n-1;j>=0;j--)
          System.out.print(a[j]+" ");  
    }
}
