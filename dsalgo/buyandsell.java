import java.util.*;
public class buyandsell
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
       int t = sc.nextInt();
       while(t>0)
       {
           int n= sc.nextInt();
           int arr[] =new int[n];
           for(int i=0;i<n;i++)
           {
               int p=sc.nextInt();
               arr[i]=p;
           }
           Stock obj = new Stock();
           Stock.stockbuyandsell(arr, n);
           System.out.println();
           t--;
       }
    }
}

class Stock
{
    static void stockbuyandsell(int arr[],int n)
    {
        int start=0, end=0;
        for(int i=0;i<n-1;i++)
        {
            
        }

    }
}
