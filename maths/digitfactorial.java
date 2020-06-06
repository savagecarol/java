import java.util.*;
import java.lang.Math.*;
class digitfactorial
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        dig f=new dig();
        while(t-->0)
        {
                int k=sc.nextInt();
                System.out.println(f.count(k));

        }

    }
}
class dig
{
  


    public long count(long n)
    {
        if (n==0 || n==1)
        {return 1;}
      double res=1;
        for(int i=1;i<=n;i++)
        {
            res=res*i;
            System.out.println(res);
        }
        System.out.println(res);
       return (int)Math.floor(Math.log10(res) + 1);
      
    }


}