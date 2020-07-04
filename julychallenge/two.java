import java.util.*;
class two 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            // Points arr[]=new Points[n];
            long sum1=0,sum2=0;
            long p=0,q=0,r=0;
            for(int i=0;i<n;i++)
            {
            long x=sc.nextLong();
            long y=sc.nextLong();
            if(x > 9)
                x= convert(x);
            if (y > 9)
                y = convert(y);
            sum1 += x;
            sum2 += y;
            if(x>y)
                p++;
            else if(y>x)
                q++;
            else
            {
                p++;
                q++;
            }
        }
        if(p>q)
        {   System.out.print(0+" ");
            System.out.println(p+" ");}
        else if(q>p)
        {System.out.print(1+" ");
        System.out.println(q+" ");}
        else
        {System.out.print(2+" ");
          System.out.println(p+" ");}
       
    }
}
static long convert(long n)
    {   long sum=0;
        while(n>0)
        {sum+=n%10;
        n=n/10;
        }
        return sum;} 
}

