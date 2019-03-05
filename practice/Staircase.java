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
        int z=sc.nextInt();
        for(int i=z;i>=1;i--)
        {
            for(int j=1;j<=z;j++)
            {
                if(j>=i)
                {
                   System.out.print("#"); 
                }else{
                    System.out.print(" ");
                }
            
                    
                
            }
            System.out.println("");
        }
    }
}
