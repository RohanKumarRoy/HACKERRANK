import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the permutationEquation function below.
   public static void main(String[] args) throws IOException{
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
            list.add(sc.nextInt());
      for(int i=1;i<=n;i++)
      {
          int n1=list.indexOf(i)+1;
          System.out.println(list.indexOf(n1)+1);
      }  
    }
}
