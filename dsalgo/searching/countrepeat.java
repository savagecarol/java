
import java.util.*;
import java.lang.*;
import java.io.*;

class Countrepeat {
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {   int p=0;
	        int n=sc.nextInt();
            int arr[]=new int[n];
            arr[0]=sc.nextInt();
	        for(int i=1;i<n;i++)
	        {int x=sc.nextInt();
               arr[i]=x;
                if(arr[i]==arr[i-1])
                    p=arr[i];
            }
           int l= leftmost(arr,0,n-1,p,n);
           int r=rightmost(arr,0,n-1,p,n);
           System.out.println(p+" "+(l-r+1));

        }  
    }
    public static int repeater(int arr[],int l,int r,int n)
    {
        if(l>r)
        return -1;
            int mid=l+(r-l)/2; 
            if (arr[mid]==p && (mid==0 || arr[mid-1]<p  ))
                return mid;  
            if(arr[mid]<p)
            return leftmost(arr,mid+1,r,p,n);
            else 
              return leftmost(arr,l,mid-1,p,n);

        return -1;
    }       


    public static int leftmost(int arr[],int l,int r,int  p,int n)
    {        if(l>r)
            return -1;
                int mid=l+(r-l)/2; 
                if (arr[mid]==p && (mid==0 || arr[mid-1]<p  ))
                    return mid;  
                if(arr[mid]<p)
                return leftmost(arr,mid+1,r,p,n);
                else 
                  return leftmost(arr,l,mid-1,p,n);
              
    }

    public static int rightmost(int arr[],int l,int r,int  p,int n)
    {    if(l>r)
            return -1;
                int mid=l+(r-l)/2; 
                if(arr[mid]==p && (arr[mid+1]!=p || mid==n-1))
                    return mid;  
                if(arr[mid]>p)
                    return rightmost(arr,l,mid-1,p,n);
                else 
                    return rightmost(arr,mid+1,r,p,n);
    }



}
