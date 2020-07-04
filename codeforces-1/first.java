import java.util.*;
public class first
{
    public static void main(String args[])
{   Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {   
      int x=sc.nextInt();
      int y=sc.nextInt();
      int n=sc.nextInt();
        int d= (n/x);
        if(d<=0)
            System.out.println(0);
        else
         { 
            if((d*x)+y<=n)
                System.out.println((d*x)+y);
            else
                {int k=((n-x)/x);
                System.out.println((k*x)+y);}

        }

    }
}
}