/* package codechef; // don't place package name! */

import java.util.*;

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
            {
                long x=sc.nextLong();
                a[i]=x;
            }
            long k=0;
            for(int i=0;i<n-1;i++)
            {
               k+= Math.abs(a[i]-a[i+1])-1;
            }
            System.out.println(k);
        }
    }
}

