import java.util.*;
public class first 
{
    public static void main(String args[])
    {    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
      
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            arr[i]=x;
        }
         Trap obj=new Trap();
         System.out.println(obj.trappingWater(arr, n));

         t--;
     }
 }
}

class Trap {
 public int trappingWater(int arr[], int n)
    {int res=0;
        int left[]=new int[n];
        int right[] =new int[n];
        int lmax=arr[0];int rmax=arr[n-1];
        for(int i=0;i<n;i++)
            {left[i]=Math.max(lmax,arr[i]);lmax=left[i];}
        for(int i=n-1;i>=0;i--)
            {right[i]=Math.max(rmax,arr[i]);rmax=right[i];}
        for(int i=0;i<n;i++)
            {res+=Math.min(left[i],right[i])-arr[i];}
        return res;




        
    }
}