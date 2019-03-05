import java.util.*;
class test
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[d];
    int k=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int j=0;j<d;j++)
    {
      b[j]=a[j];
    }
    for(int i=0;i<n;i++)
    {
      if(d<n)
      {
        a[i]=a[d];
        d++;
      }
      else
      {
         a[i]=b[k];
         k++;
      }
    }
    for(int i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
  }
}