import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;
class meanmedian
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        MM obj=new MM();
        while(t-->0)
        {
           int N;
           N=sc.nextInt();
           int a[]=new int[N];
           for(int i=0;i<N;i++)
           {
               int x=sc.nextInt();
               a[i]=x;
           }
           System.out.println(obj.mean(a, N)+" "+obj.median(a, N));
        }		// your code goes here
	}
}

class MM
{
    
  public int median(int A[],int n)
    {
       Arrays.sort(A);
       if(n%2!=0)
       {
           return A[n/2];
       }
       else
       {
           return (A[n/2]+A[(n/2)-1])/2;
       }
       
    }
    
    public int mean(int A[],int N)
    {
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+A[i];
        }
        return sum/N;
    }

}
