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
        long[] a=new long[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        
        long[] b=new long[5];
         b[0]=a[1]+a[2]+a[3]+a[4];
         b[1]=a[0]+a[2]+a[3]+a[4];
         b[2]=a[0]+a[1]+a[3]+a[4];
         b[3]=a[0]+a[1]+a[2]+a[4];
         b[4]=a[0]+a[1]+a[2]+a[3];
        
        Arrays.sort(b);
        System.out.print(b[0]);
        System.out.print(" ");
        System.out.print(b[4]);
    }
}
