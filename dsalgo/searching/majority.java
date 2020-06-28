import java.util.*;

import sun.net.www.content.text.plain;
public class majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int a[] =new int[n];
            for(int i=0;i<n;i++)
            {
                int p=sc.nextInt();
                a[i]=p;
            }
            Major mj=new Major();
            System.out.println(mj.majorityElement(a, n));
            t--;
        }
    }
}

class Major {
    int majorityElement(int a[], int n)
    {
        int count=1;
        int p=0;
    for(int i=1;i<n;i++)
    {
        if(a[p]==a[i])
            count++;
        else
            count--;
        if(count==0)
        {
            p=i;
            count=1;
        }
    }


    count=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]==p)
        {
           count++;     
        }
    }

    if(count>n/2)
    {
        return a[p];
    }
    return -1;
}
}