import java.util.*;
class celsius
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
            System.out.println(obj.convert(c));
        }

    }

}
class cltof
{
    public int convert(int x)
    {
        int count=0;
        System.out.println(count);
        int res=0;
        while(x>0)
        {
            if((x&1)==1)
                res++;
            else
               res=0;
            if(res>=count)
               count=res;
            x=x>>1;
            System.out.println(x);
           }
           return count;
        
    }
}