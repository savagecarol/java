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
    public double convert(int c)
    {
        return (c*(9/5))+32;
    }
}