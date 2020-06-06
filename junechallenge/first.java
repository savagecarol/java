/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;
class first
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int arr[]=new int[x];
            for(int i=0;i<x;i++)
            {
                int z=sc.nextInt();
                arr[i]=z;
            }
            Work.profit(arr,y);
        }		// your code goes here
	}
}
class  Work
{
    public static void profit(int arr[] , int y)
    {    int sum=0;
        int count=0;
        int n=arr.length;
        int i;
        for( i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(arr[i]>y)
                    arr[i]=y;
            count=count+arr[i];
        }
        System.out.println(sum-count);  
    }
}
