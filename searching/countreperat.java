
import java.util.*;
import java.lang.*;
import java.io.*;

class Countrepeat {
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {int x=sc.nextInt();
               arr[i]=x;
            }
            int p=4;
           int l= leftmost(arr,0,n-1,p);
        //    int r=rightmost(arr,0,n-1,p);
           System.out.println(l+" "+r);

        }  
    }
    int leftmost(int arr[],int l,int r,int  p)
    {    if(l>r)
         return -1;
             int mid=l+(r-l)/2;   
                if(arr[mid]>p)
                    return leftmost(arr,l,mid-1,p);
                else (arr[mid]<p)
                    return leftmost(arr,mid+1,r,p);
                else
                    return mid;
    }

    // int rightmost(int arr[],int l,int r,int  p)
    // {    if(l>r)
    //         return -1;
    //             int mid=(l+r)/2;
    //             if(arr[mid==p])
    //                 return mid;   
    //             if(arr[mid]>p)
    //                 return rightmost(arr,l,mid-1,p);
    //             else 
    //                 return rightmost(arr,mid+1,r,p);


    //             }
}
