import java.util.*;
public class prime {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            pr ip=new pr();
            if(ip.pq(n))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }

    }
    
}


class pr
{
    
    public boolean pq(int n)
    {
       int flag=0;
         if (n <= 1)  return false; 
         int k=(int)Math.sqrt(n);
    for (int i=2; i<k; i++) 
    {
        if (n%i == 0)
        { 
             flag=1;
        }
    }
    if (flag==1)
    {
        return false;
    }
    else{
        return true;
    }
    
    }


}