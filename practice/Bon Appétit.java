import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] bill=new int[n];
        for(int i=0;i<n;i++)
            bill[i]=sc.nextInt();
        int b=sc.nextInt();
        
        int a_b=0;
        for(int i=0;i<n;i++)
            a_b=a_b+bill[i];
            
            a_b=(a_b-bill[k])/2;
        
        if(a_b==b)
            System.out.print("Bon Appetit");
        else
            System.out.print(b-a_b);
    }
}