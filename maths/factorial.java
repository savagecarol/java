import java.util.*;
import java.io.*;
class factorial
{
    public static void main(String arr[]){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            fact f=new fact();
            while(t-->0)

            {
                int k=sc.nextInt();
                System.out.println(f.fac(k));
                

            }
        }
}
class fact
{
    public long fac(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else
        {
            return n*fac(n-1);
        }


    }
}