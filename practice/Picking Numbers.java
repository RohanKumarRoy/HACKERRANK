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

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

   public static void main(String[] args) {

    int n,l=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
         Arrays.sort(a);
    for(int i=0;i<n;i++)
    { 
        int count=1;
        for(int j=1+i;j<n;j++)
        {
            if(a[j]-a[i]<=1)
               count++;
        }
        l=count>l?count:l;
    }
    System.out.println(l);
    }

}

