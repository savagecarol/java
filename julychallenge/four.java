import java.util.*;
public class four 
{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)  
        {
            int n=sc.nextInt();
            Points arr[]=new Points[(4*n)-1];
            for(int i=0;i<(4*n)-1;i++)
                arr[i]=new Points(sc.nextLong(),sc.nextLong());
           long p=0,q=0;
            for(int i=0;i<(4*n)-1;i++)
                {p^=arr[i].x;
                q^=arr[i].y;}
            System.out.println(p+" "+q);
        }

    }   
}

class Points
{
    long x;
    long y;
    Points(long x,long y)
    {
        this.x=x;
        this.y=y;
    }
}