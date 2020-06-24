import java.util.*;
class countbits
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            cltof obj=new cltof();
            int c;
            c=sc.nextInt();
            System.out.println(obj.countSetBits(c));
        }

    }

}

class cltof
{
public static int countSetBits(int n)
{
    if(n==0||n==1|| n==2)
    {
        return n;
    }
    int k=2;
    double p=0;
    double t=0;
    while(k<=n)
    {   
        double s=n/k;
        p+=(s/2*k);
        k=k*2;
        t++;
    }
    return (int)(p+(t-1));

}

}



// int res=0;
// for(int i=1;i<=n;i++)
// {int k=i;
//  while(k>0)
// {
//     k=((k&(k-1)));
//     res++;
// }
// }
// return res;