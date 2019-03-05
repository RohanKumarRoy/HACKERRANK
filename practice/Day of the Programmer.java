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
        int y=sc.nextInt();
        if(y==1918){
            System.out.print("26.09."+y);
             //break;
        }else{
        if(y>=1700 && y<=1917)
        {   
            if((y%4)==0)
                System.out.print("12.09."+y);
            else
               System.out.print("13.09."+y); 
        }else{
        if((y%400)==0||(y%4)==0 && (y%100)!=0)
        {
            System.out.print("12.09."+y);
        }else
                System.out.print("13.09."+y);
        }
        }
        }
    }
    

